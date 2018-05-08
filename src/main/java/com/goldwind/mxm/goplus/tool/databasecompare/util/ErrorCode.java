package com.goldwind.mxm.goplus.tool.databasecompare.util;

/**
 * Created by alex on 2017/11/27.
 */
public interface ErrorCode {
    public static final String SYSTEM_BUSY = "-1"; // 系统繁忙
    public static final String SUCCESS = "0"; // 操作成功
    public static final String SYSTEM_API_UNSUPORT = "9"; // 该接口暂停使用，不用再次请求。
    public static final String SYSTEM_ERROR = "10"; // 系统错误，业务无法捕捉的错误。

    public static final String SYSTEM_HTTP_POST = "10001"; // 需要POST请求
    public static final String SYSTEM_HTTP_GET = "10002"; // 需要GET请求
    public static final String SYSTEM_HTTPS = "10003"; // 需要HTTPS请求
    public static final String IP_LIMIT = "10004"; // 请求IP被限制。
    public static final String API_NOEXIST = "10005"; // 请求接口不存在。
    public static final String PARAMETER_REQUIRED = "10006";// 缺少请求参数
    public static final String PARAMETER_ERROR = "10007"; // 请求参数不合法
    public static final String FILE_ERROR = "10008"; // 操作文件错误
    public static final String APP_UPDATE_NONEW = "10009"; // 未发现更新文件
    public static final String APP_UPDATE_HASNEW = "10010"; // 发现更新文件
    public static final String SAVE_FAIL = "10011"; // 保存失败
    public static final String UPDATE_FAIL = "10012"; // 更新失敗
    public static final String DELETE_FAIL = "10013";// 删除失败
    public static final String DUPLICATE = "10014"; // 数据重复
    public static final String DOWNLOAD_FAIL = "10015"; // 下載失敗
    public static final String MAX_LIMIT = "10016";// 超出最大范围
    public static final String SEND_FAIL = "10017"; // 发送失败
    public static final String OPERATE_FAIL = "10018"; // 操作失败
    public static final String HAS_OVERDUE = "10019";// 验证码过期失效或不对
    public static final String NAME_ISEXIST = "10020";//名称已存在
    public static final String HAS_RELATION_DATA = "10021";//存在关联数据
    public static final String OVER_TIME = "10022";//超出有效时间
    public static final String USER_ISNOTEXIST = "10023";//用户不存在
}
