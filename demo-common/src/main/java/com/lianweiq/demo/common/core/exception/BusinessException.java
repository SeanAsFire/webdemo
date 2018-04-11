package com.lianweiq.demo.common.core.exception;

/**
 * 业务异常。业务必须捕捉处理的异常，它属于业务的一部分。 Created by zujul on 2017/8/7.
 */
public class BusinessException extends Exception {

    private static final long serialVersionUID = 6672002926009876232L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
