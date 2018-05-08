package com.goldwind.mxm.goplus.tool.databasecompare.service;

import com.goldwind.mxm.goplus.tool.databasecompare.util.JdbcUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by alex on 2018/3/19.
 */
@Service
public class IndexService {
    @Autowired
    private JdbcUtil  util;
    public Object index() throws SQLException {
        util.setUrl("jdbc:mysql://10.1.248.145:3306/sesgoplusdb");
        util.setUser("goplus");
        util.setPassword("goplusdbadmin");
        return  util.query("select * from ses_wtinfo",null);
    }

}
