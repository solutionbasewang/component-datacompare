package com.goldwind.mxm.goplus.tool.databasecompare.service;

import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseJobVersionMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobVersion;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobVersionExample;
import com.goldwind.mxm.goplus.tool.databasecompare.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by alex on 2018/3/21.
 */
@Service
public class DatasourceJobVersionService {
    @Autowired
    private SesToolDatabaseJobVersionMapper mapper;

    @Transactional
    public SesToolDatabaseJobVersion insert(SesToolDatabaseJobVersion record) throws InterruptedException {
        Thread.sleep(1000);
        SesToolDatabaseJobVersion new_value = new SesToolDatabaseJobVersion();
        record.setId(UUID.randomUUID().toString());
        new_value.setFkJobId(record.getFkJobId());
        new_value.setLastflag(1);
        record.setCreatetime(DateUtil.getNow());
        SesToolDatabaseJobVersion temp=getWhere(new_value);
        if(temp==null){
            record.setLastflag(1);
            record.setVersion("1");
        }
        else {
            int n = Integer.parseInt(temp.getVersion());
            temp.setLastflag(0);
            mapper.updateByPrimaryKey(temp);
            record.setVersion(Integer.toString(n+1));
        }
        record.setLastflag(1);
        if(mapper.insert(record)>0) {
            return record;
        }
        else {
            return null;
        }
    }
    public SesToolDatabaseJobVersion getByPrimaryKey(String id){
        return mapper.selectByPrimaryKey(id);
    }
    public SesToolDatabaseJobVersion getWhere(SesToolDatabaseJobVersion record) throws NullPointerException{
        SesToolDatabaseJobVersionExample example = new SesToolDatabaseJobVersionExample();
        SesToolDatabaseJobVersionExample.Criteria criteria = example.createCriteria();
        if(record.getId()!=null){
            criteria.andIdEqualTo(record.getId());
        }
        if(record.getFkJobId()!=null){
            criteria.andFkJobIdEqualTo(record.getFkJobId());
        }
        if(record.getVersion()!=null){
            criteria.andVersionEqualTo(record.getVersion());
        }
        if(record.getVersionType()!=null){
            criteria.andVersionTypeEqualTo(record.getVersionType());
        }
        if(record.getLastflag()!=null){
            criteria.andLastflagEqualTo(record.getLastflag());
        }
        List<SesToolDatabaseJobVersion> list = mapper.selectByExample(example);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        else {
            return null;
        }
    }
}
