package com.goldwind.mxm.goplus.tool.databasecompare.service;

import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseDatasourceMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseDatasource;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseDatasourceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alex on 2018/3/21.
 */
@Service
public class DatasourceService {
    @Autowired
    private SesToolDatabaseDatasourceMapper mapper;
    /**
     *  @author alex
     *  @version 1.0
     *  @param id 主键
     *  @return 返回实体对象
     *  @description
     * */
    public SesToolDatabaseDatasource getByKey(String id) throws NullPointerException{
        SesToolDatabaseDatasource value= mapper.selectByPrimaryKey(id);
        return value;
    }

}
