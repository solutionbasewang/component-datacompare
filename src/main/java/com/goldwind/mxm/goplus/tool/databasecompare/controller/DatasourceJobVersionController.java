package com.goldwind.mxm.goplus.tool.databasecompare.controller;

import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobVersion;
import com.goldwind.mxm.goplus.tool.databasecompare.service.DatasourceJobVersionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by alex on 2018/3/22.
 */
@RestController
public class DatasourceJobVersionController {
    @Autowired
    private DatasourceJobVersionService jvs;
    @ApiOperation(value = "新增扫描版本")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(@RequestBody SesToolDatabaseJobVersion record) throws InterruptedException {
        return jvs.insert(record);
    }
}
