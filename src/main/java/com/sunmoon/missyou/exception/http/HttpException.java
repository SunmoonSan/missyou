package com.sunmoon.missyou.exception.http;

/**
 * @author San
 * @time 2021/11/6 4:21 下午
 * @desc
 */
public class HttpException extends RuntimeException {
    protected Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    protected Integer httpStatusCode = 500;
}
