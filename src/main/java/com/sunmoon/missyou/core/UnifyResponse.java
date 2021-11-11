package com.sunmoon.missyou.core;

/**
 * @author San
 * @time 2021/11/6 4:40 下午
 * @desc
 */

public class UnifyResponse {
    private int code;
    private String msg;
    private String request;

    public UnifyResponse(int code, String msg, String request) {
        this.code = code;
        this.msg = msg;
        this.request = request;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
