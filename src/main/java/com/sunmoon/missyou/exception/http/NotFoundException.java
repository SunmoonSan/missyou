package com.sunmoon.missyou.exception.http;

/**
 * @author San
 * @time 2021/11/6 4:22 下午
 * @desc
 */
public class NotFoundException extends HttpException {

    public NotFoundException(int code) {
        this.httpStatusCode = 404;
        this.code = code;
    }
}
