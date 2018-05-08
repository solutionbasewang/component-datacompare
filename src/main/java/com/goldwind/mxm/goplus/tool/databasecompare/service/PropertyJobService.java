package com.goldwind.mxm.goplus.tool.databasecompare.service;

import com.goldwind.mxm.goplus.tool.databasecompare.dao.*;
import com.goldwind.mxm.goplus.tool.databasecompare.model.*;
import com.goldwind.mxm.goplus.tool.databasecompare.util.DateUtil;
import com.goldwind.mxm.goplus.tool.databasecompare.util.JdbcUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by alex on 2018/3/27.
 */
@Service
public class PropertyJobService {
    @Autowired
    private SesToolDatabaseDatasourceMapper ddmapper;
    @Autowired
    private DatasourceJobVersionService jvs;
    @Autowired
    private SesToolDatabaseJobPropertyMapper jpm_mapper;
    @Autowired
    private SesToolDatabaseJobPropertyruleMapper jprm_mapper;
    @Autowired
    private SesToolDatabaseSourceLogPropertyMapper lpm_mapper;
    @Autowired
    private SesToolDatabaseJobPropertyWhereMapper jpwm_mapper;
    @Autowired
    private JdbcUtil util;
    public void jobStart_Property() throws SQLException, InterruptedException {
        SesToolDatabaseJobPropertyExample propertyexample = new SesToolDatabaseJobPropertyExample();
        propertyexample.createCriteria().andStateEqualTo(1);
        List<SesToolDatabaseJobProperty> list = jpm_mapper.selectByExample(propertyexample);
        for (SesToolDatabaseJobProperty property:list
             ) {
            //get dataset's where
            String where = createSql(property);
            //get job dataset
            SesToolDatabaseDatasource datasource=ddmapper.selectByPrimaryKey(property.getFkDatasourceid());
            util.setUrl(datasource.getDatasourceAddress());
            util.setUser(datasource.getDatasourceUsername());
            util.setPassword(datasource.getDatasourcePwd());

            List<Map<String, Object>> keydataset= util.query(property.getDataset()+" "+where,null);
            if(keydataset.size()==0){
                return;
            }
            //create version
            SesToolDatabaseJobVersion v_temp= new SesToolDatabaseJobVersion();
            v_temp.setId(UUID.randomUUID().toString());
            v_temp.setCreatetime(DateUtil.getNow());
            v_temp.setVersionType("2");
            v_temp.setFkJobId(property.getId());
            SesToolDatabaseJobVersion version = jvs.insert(v_temp);
            if(version==null){
                return;
            }
            SesToolDatabaseJobPropertyruleExample ruleexample = new SesToolDatabaseJobPropertyruleExample();
            ruleexample.createCriteria().andFkJobIdEqualTo(property.getId());
            List<SesToolDatabaseJobPropertyrule> rulelist = jprm_mapper.selectByExample(ruleexample);
            checkrule(rulelist,keydataset,property,version.getId());

        }
    }
    private void checkrule(List<SesToolDatabaseJobPropertyrule> rules,List<Map<String, Object>> records,SesToolDatabaseJobProperty job,String versionid){
        for (Map<String,Object> record:records
             ) {
            for (SesToolDatabaseJobPropertyrule rule:rules
                 ) {
                SesToolDatabaseSourceLogProperty logProperty = new SesToolDatabaseSourceLogProperty();
                logProperty.setId(UUID.randomUUID().toString());
                logProperty.setLogResult((String) record.get(job.getPkey()));
                logProperty.setFkDatasourceid(job.getFkDatasourceid());
                logProperty.setFkVersionId(versionid);
                logProperty.setFkJobId(job.getId());
                logProperty.setFkJobPropertyId(rule.getId());
                if(rule.getIsnull()!=null)
                {
                    if(record.get(rule.getPropertyName())==null)
                    {
                        lpm_mapper.insert(logProperty);
                    }
                }
                else if(rule.getMax()!=null){
                    try {
                        Double flag = Double.parseDouble((String) record.get(rule.getPropertyName())) ;
                        if(flag>rule.getMax()){
                            lpm_mapper.insert(logProperty);
                        }
                    }
                    catch (Exception e){
                        lpm_mapper.insert(logProperty);
                    }
                }
                else if(rule.getMin()!=null)
                {
                    try {
                        Double flag = Double.parseDouble((String) record.get(rule.getPropertyName()));
                        if(flag<rule.getMin()){
                            lpm_mapper.insert(logProperty);
                        }
                    }
                    catch (Exception e){
                        lpm_mapper.insert(logProperty);
                    }
                }
                else if(rule.getEqual()!=null){
                    try{
                       String flag=record.get(rule.getPropertyName()).toString();
                       if(!flag.equals(rule.getEqual())){
                           lpm_mapper.insert(logProperty);
                       }
                    }
                    catch (Exception e)
                    {
                        lpm_mapper.insert(logProperty);
                    }
                }
            }

        }
    }
    private String createSql(SesToolDatabaseJobProperty proterty)
    {
        String sql=" where 1=1 ";;
        SesToolDatabaseJobPropertyWhereExample example = new SesToolDatabaseJobPropertyWhereExample();
        example.createCriteria().andFkJobIdEqualTo(proterty.getId());
        List<SesToolDatabaseJobPropertyWhere> list = jpwm_mapper.selectByExample(example);
        for (SesToolDatabaseJobPropertyWhere where:list
             ) {
            sql+=parseContext(where.getWhereContext(),where.getPropertyType());
        }
        return sql;
    }
    private String parseContext(String where,int type){
        String sql=" ";
        if(type==1){
            sql+=where;
        }
        else if(type==2){
            sql+=where;
        }
        else if(type==3)
        {
            if(where.contains("{bday}")){
                String bdate=DateUtil.formatDateToString(DateUtil.getNow(),DateUtil.YYYY_MM_DD)+" 00:00:00";
                where.replace("{bday}",bdate);
            }
            if(where.contains("{eday}")){
                String eday=DateUtil.formatDateToString(DateUtil.getNow(),DateUtil.YYYY_MM_DD)+" 23:59:59";
                where.replace("{eday}",eday);
            }
            if(where.contains("{bweek}"))
            {
                String bweek=DateUtil.formatDateToString(DateUtil.getStartDayOfWeek(DateUtil.getNow()),DateUtil.YYYY_MM_DD)+" 00:00:00";
                where.replace("{bweek}",bweek);
            }
            if(where.contains("{eweek}")){
                String eweek=DateUtil.formatDateToString(DateUtil.getEndDayOfWeek(DateUtil.getNow()),DateUtil.YYYY_MM_DD)+" 23:59:59";
                where.replace("{eweek}",eweek);
            }
            if(where.contains("{bmonth}")){
                String bmonth=DateUtil.formatDateToString(DateUtil.getMonthStartDay(DateUtil.getNow()),DateUtil.YYYY_MM_DD)+" 00:00:00";
                where.replace("{bmonth}",bmonth);
            }
            if(where.contains("{emonth}")){
                String emonth=DateUtil.formatDateToString(DateUtil.getEndDayOfMonth(DateUtil.getNow()),DateUtil.YYYY_MM_DD)+" 23:59:59";
                where.replace("{emonth}",emonth);
            }
            sql+=where;
        }
        return sql;
    }
}
