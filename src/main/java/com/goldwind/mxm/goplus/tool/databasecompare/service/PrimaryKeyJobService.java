package com.goldwind.mxm.goplus.tool.databasecompare.service;

import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseDatasourceMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseJobNodeMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseJobPrimarykeyMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseSourceLogMapper;
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
 * Created by alex on 2018/3/23.
 */
@Service
public class PrimaryKeyJobService {
    @Autowired
    private DatasourceService ds;
    @Autowired
    private SesToolDatabaseJobPrimarykeyMapper jpmapper;
    @Autowired
    private SesToolDatabaseJobNodeMapper jnmapper;
    @Autowired
    private SesToolDatabaseDatasourceMapper ddmapper;
    @Autowired
    private DatasourceJobVersionService jvs;
    @Autowired
    private SesToolDatabaseSourceLogMapper slm;
    @Autowired
    private JdbcUtil util;

    public void jobStart_Primary() throws InterruptedException, SQLException {
        SesToolDatabaseJobPrimarykeyExample t_example= new SesToolDatabaseJobPrimarykeyExample();
        t_example.createCriteria().andStateEqualTo(1);
        List<SesToolDatabaseJobPrimarykey> list = jpmapper.selectByExample(t_example);
        for (SesToolDatabaseJobPrimarykey key:list
             ) {
            //get job dataset
            SesToolDatabaseDatasource datasource=ddmapper.selectByPrimaryKey(key.getFkDatasourceid());
            util.setUrl(datasource.getDatasourceAddress());
            util.setUser(datasource.getDatasourceUsername());
            util.setPassword(datasource.getDatasourcePwd());
            List<Map<String, Object>> keydataset= util.query(key.getDataset(),null);
            if(keydataset.size()==0){
                return;
            }
            //create version
            SesToolDatabaseJobVersion v_temp= new SesToolDatabaseJobVersion();
            v_temp.setId(UUID.randomUUID().toString());
            v_temp.setCreatetime(DateUtil.getNow());
            v_temp.setVersionType("1");
            v_temp.setFkJobId(key.getId());
            SesToolDatabaseJobVersion version = jvs.insert(v_temp);
            if(version==null){
                return;
            }
            //find job's nodes
            SesToolDatabaseJobNodeExample example = new SesToolDatabaseJobNodeExample();
            example.createCriteria().andFkJobIdEqualTo(key.getId());
            List<SesToolDatabaseJobNode> nlist = jnmapper.selectByExample(example);
            for (SesToolDatabaseJobNode node:nlist
                 ) {
                nodeDO(node,datasource,keydataset,v_temp.getId());
            }
        }
    }
    private void nodeDO(SesToolDatabaseJobNode node,SesToolDatabaseDatasource source,List<Map<String, Object>> keydataset,String versionid) throws SQLException {
        util.setUrl(source.getDatasourceAddress());
        util.setUser(source.getDatasourceUsername());
        util.setPassword(source.getDatasourcePwd());
        Map<String,Integer> listtemp = util.query_count(node.getDataset(),node.getPkey(),null);
        for (Map<String,Object> map:keydataset
             ) {
            SesToolDatabaseSourceLog log = new SesToolDatabaseSourceLog();
            log.setId(UUID.randomUUID().toString());
            log.setFkJobId(node.getFkJobId());
            log.setFkDatasourceid(source.getId());
            log.setFkVersionId(versionid);
            log.setLogResult((String) map.get(node.getPkey()));
            log.setFkJobNodeId(node.getId());
            if (listtemp.get(map.get(node.getPkey())) == null) {
                slm.insert(log);
            }
            else {
                int num = (int)listtemp.get(map.get(node.getPkey()));
                if(!checkNum(num,node.getRecordCount(),node.getCompare()))
                {
                    slm.insert(log);
                }
            }
        }
    }
    private boolean checkNum(int a,int b,String compare){
        if(compare.equals(">")){
            return a>b;
        }
        else if(compare.equals(">=")){
            return a>=b;
        }
        else if(compare.equals("=")){
            return a==b;
        }
        else if(compare.equals("<")){
            return a<b;
        }
        else if(compare.equals("<=")){
            return a<=b;
        }
        else if(compare.equals("!=")){
            return a!=b;
        }
        else {
            return false;
        }
    }


}
