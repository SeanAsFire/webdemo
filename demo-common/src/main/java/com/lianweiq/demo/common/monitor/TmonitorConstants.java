package com.lianweiq.demo.common.monitor;

public final class TmonitorConstants {

    // sql查询的结果集大于该值打印日志
    public static final int DEFAULT_MASS_RESULT_LOG_SIZE = 50;
    // sql查询的结果集大于该值记录监控
    public static final int DEFAULT_MASS_RESULT_MONITOR_SIZE = 3000;

    public static final String SLOW_SQL_COST_TIME = "SLOW_SQL_COST_TIME";
    public static final String SQL_COST_TIME = "SQL_COST_TIME";
    public static final String DB_EXCEPTION = "DB_EXCEPTION";
    public static final String SUCCESS = "_Success";
    public static final String EXECUTE = "_Execute";
    public static final String CHECKPARAMS_FAIL = "_CheckParamsFail";
    public static final String ERROR = "_Error";
    public static final String FAIL = "_Fail";
    public static final String SERVICE_EXCEPTION = "_ServiceException";
    public static final String ILLEGAL_ARGUMENT_EXCEPTION = "_IllegalArgumentException";
    public static final String CONSUME_EXECUTE = "_ConsumeExecute";
    public static final String CONSUME_ERROR = "_ConsumeError";
    public static final String CONSUME_NEEDREPAIR = "_ConsumeNeedRepair";
    public static final String EMPTY = "_Empty";


}