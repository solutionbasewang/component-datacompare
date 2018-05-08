package com.goldwind.mxm.goplus.tool.databasecompare.service;

import com.goldwind.mxm.goplus.tool.databasecompare.dao.SesToolDatabaseSourceLogMapper;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseSourceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by alex on 2018/3/21.
 */
@Service
public class DatasourceLogService {
    @Autowired
    private SesToolDatabaseSourceLogMapper mapper;

    public int insert(SesToolDatabaseSourceLog log) throws Exception{
        return mapper.insert(log);
    }
}
