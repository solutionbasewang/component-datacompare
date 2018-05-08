package com.goldwind.mxm.goplus.tool.databasecompare.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 2017/12/4.
 */
public enum ReportTypeCode {
    DAYREPORT("1",1),WEEKREPORT("2",2),MONTHREPORT("3",3),QUARTER("4",4),YEARREPORT("5",5);

    private String name ;
    private int index ;
    ReportTypeCode(String name, int index) {
        this.name=name;
        this.index=index;
    }
    private static Map<String, ReportTypeCode> map = new HashMap<String, ReportTypeCode>();
    static {
        for (ReportTypeCode legEnum : ReportTypeCode.values()) {
            map.put(legEnum.getName(), legEnum);
        }
    }

    public String getName() {
        return name;
    }
    public int getIndex() {
        return index;
    }
    public static ReportTypeCode findByName(String name){
        return map.get(name);
    }
}
