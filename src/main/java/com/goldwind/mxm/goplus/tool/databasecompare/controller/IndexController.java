package com.goldwind.mxm.goplus.tool.databasecompare.controller;

import com.goldwind.mxm.goplus.tool.databasecompare.service.IndexService;
import com.goldwind.mxm.goplus.tool.databasecompare.service.PrimaryKeyJobService;
import com.goldwind.mxm.goplus.tool.databasecompare.service.PropertyJobService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 * Created by alex on 2018/3/19.
 */
@RestController
public class IndexController {
    @Autowired
    private IndexService is;
    @Autowired
    private PropertyJobService pjs;
    @Autowired
    private PrimaryKeyJobService pks;
    @ApiOperation(value = "属性规则检查")
    @RequestMapping(value = "/propertycheck",method = RequestMethod.GET)
    public Object propertycheck(@RequestParam String id) throws InterruptedException, SQLException {
        //pks.jobStart_Primary();
        pjs.jobStart_Property();
        return "";
    }
    @ApiOperation(value = "主键一致性检查")
    @RequestMapping(value = "/primarycheck",method = RequestMethod.GET)
    public Object primarycheck(@RequestParam String id) throws InterruptedException, SQLException {
        pks.jobStart_Primary();
        return "";
    }
}
