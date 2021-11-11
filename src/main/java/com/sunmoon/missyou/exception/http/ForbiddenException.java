package com.sunmoon.missyou.exception.http;

/**
 * @author San
 * @time 2021/11/6 4:24 下午
 * @desc
 */
public class ForbiddenException extends HttpException {
    public ForbiddenException(int code) {
        this.httpStatusCode = 403;
        this.code = code;
    }
}
