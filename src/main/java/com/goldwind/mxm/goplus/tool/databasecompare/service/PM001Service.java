package com.goldwind.mxm.goplus.tool.databasecompare.service;

import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseJobNodeMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseJobPrimarykeyMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobNode;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobNodeExample;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobPrimarykey;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobPrimarykeyExample;
import com.goldwind.mxm.goplus.tool.databasecompare.model.view.PM001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 2018/3/21.
 */
@Service
public class PM001Service {
    @Autowired
    private SesToolDatabaseJobPrimarykeyMapper primarykeyMapper;
    @Autowired
    private SesToolDatabaseJobNodeMapper nodeMapper;

    public PM001 getByKey(String id) throws NullPointerException{
        PM001 pm001 = new PM001();
        SesToolDatabaseJobPrimarykey primarykey = primarykeyMapper.selectByPrimaryKey(id);
        pm001.setPrimarykey(primarykey);
        SesToolDatabaseJobNodeExample example = new SesToolDatabaseJobNodeExample();
        example.createCriteria().andFkJobIdEqualTo(id);
        pm001.setNodelist(nodeMapper.selectByExample(example));
        return pm001;
    }

    public List<PM001> getByDataSourceID(String id){
        List<PM001> returnvalue=new ArrayList<>();
        SesToolDatabaseJobPrimarykeyExample mexample = new SesToolDatabaseJobPrimarykeyExample();
        mexample.createCriteria().andFkDatasourceidEqualTo(id);
        List<SesToolDatabaseJobPrimarykey> list =primarykeyMapper.selectByExample(mexample);
        for (SesToolDatabaseJobPrimarykey key:list
             ) {
            SesToolDatabaseJobNodeExample nodeExample  = new SesToolDatabaseJobNodeExample();
            nodeExample.createCriteria().andFkJobIdEqualTo(key.getId());
            PM001 p = new PM001();
            p.setPrimarykey(key);
            p.setNodelist(nodeMapper.selectByExample(nodeExample));
            returnvalue.add(p);
        }
        return returnvalue;
    }

}
