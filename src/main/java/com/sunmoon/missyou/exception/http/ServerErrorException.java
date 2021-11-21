package com.sunmoon.missyou.exception.http;

/**
 * @author San
 * @time 2021/11/21 14:35:08
 * @desc
 */
public class ServerErrorException extends HttpException {
    public ServerErrorException(int code) {
        this.httpStatusCode = 500;
        this.code = code;
    }
}
