package com.goldwind.mxm.goplus.tool.databasecompare.util;



import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alex on 2018/3/19.
 */
@Service
public class JdbcUtil {
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private static String driver = "com.mysql.jdbc.Driver";
    private String url; //= "jdbc:mysql://localhost:3306/Student";
    private String user;// = "root";
    private String password;// = "root";

    /**
     * Get the driver
     */
    static {

    }
    /**
     * Connect the database
     */
    public Connection getCon() {
        try {
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        try {
            conn = (Connection) DriverManager
                    .getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * @param sql
     * @param obj
     *Update
     */
    public int update(String sql, Object... obj) {
        int count = 0;
        conn = getCon();
        try {
            stmt = conn.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    stmt.setObject(i + 1, obj[i]);
                }
            }
            count = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return count;
    }

    /**
     * @param sql
     * @param obj
     * Query
     */
    public List<Map<String, Object>> query(String sql, Object... obj) throws SQLException {
        if(conn==null||conn.isClosed()){conn = getCon();}
        List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
        try {
            stmt = conn.prepareStatement(sql);
            while (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    stmt.setObject(i + 1, obj[i]);
                }
            }
            rs = stmt.executeQuery();
            ResultSetMetaData md = rs.getMetaData(); //获得结果集结构信息,元数据
            int columnCount = md.getColumnCount();   //获得列数
            while (rs.next()) {
                Map<String,Object> rowData = new HashMap<String,Object>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.put(md.getColumnName(i), rs.getObject(i));
                }
                list.add(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return list;
    }

    public Map<String,Map<String,Object>> query(String sql,int key,Object... obj) throws SQLException {
        if(conn==null||conn.isClosed()){conn = getCon();}
        Map<String,Map<String,Object>>  list = new HashMap<>();
        try {
            stmt = conn.prepareStatement(sql);
            while (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    stmt.setObject(i + 1, obj[i]);
                }
            }
            rs = stmt.executeQuery();
            ResultSetMetaData md = rs.getMetaData(); //获得结果集结构信息,元数据
            int columnCount = md.getColumnCount();   //获得列数
            while (rs.next()) {
                Map<String,Object> rowData = new HashMap<String,Object>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.put(md.getColumnName(i), rs.getObject(i));
                }
                //list.add(rowData);
                list.put(md.getColumnName(key),rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return list;
    }
    public Map<String,Integer> query_count(String sql,String key,Object... obj) throws SQLException {
        if(conn==null||conn.isClosed()){conn = getCon();}
        Map<String,Integer>  list = new HashMap<>();
        try {
            stmt = conn.prepareStatement(sql);
            while (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    stmt.setObject(i + 1, obj[i]);
                }
            }
            rs = stmt.executeQuery();
            ResultSetMetaData md = rs.getMetaData(); //获得结果集结构信息,元数据
            int columnCount = md.getColumnCount();   //获得列数
            int flag=1;
            for (int i = 1; i <=columnCount ; i++) {
                if(md.getColumnName(i).equals(key)){
                    flag=i;
                    break;
                }
            }
            while (rs.next()) {
                Integer num=list.get((String) rs.getObject(md.getColumnName(1)));
                if(num==null){
                    list.put((String) rs.getObject(md.getColumnName(flag)),1);
                }
                else {
                    list.put((String) rs.getObject(md.getColumnName(flag)),num+1);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return list;
    }
    /**
     * CLose the resource
     */
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
