package com.hjw.frame.common.exception;

/**
 * @author Created by ygdxd_admin at 2017-11-30 下午5:32
 */
public class BaseException extends Exception {

    private static final long serialVersionUID = 7067934050289693771L;

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message, Exception e) {
        super(message ,e);
    }
}









