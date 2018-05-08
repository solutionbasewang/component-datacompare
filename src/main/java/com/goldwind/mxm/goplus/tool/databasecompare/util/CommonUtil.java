package com.goldwind.mxm.goplus.tool.databasecompare.util;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 2017/11/27.
 */
public class CommonUtil {

    public static Map<String, Object> renderMsg(String errCode, String errMsg, Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errcode", errCode);
        map.put("errmsg", errMsg);
        map.put("data", obj);
        return map;
    }
    /**
     *  @author alex
     *  @version 1.0
     *  @param f 格式化值
     *  @return 返回值
     *  @description 保留两位小数
     * */
    public static float MathM2(Double f){
        BigDecimal   b   =   new BigDecimal(f);
        return (float) b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static float MathM2(Float f){
        BigDecimal   b   =   new BigDecimal(f);
        return (float) b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
