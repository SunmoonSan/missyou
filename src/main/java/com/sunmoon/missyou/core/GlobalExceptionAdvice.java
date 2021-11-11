package com.sunmoon.missyou.core;

import com.sunmoon.missyou.core.configuration.ExceptionCodeConfiguration;
import com.sunmoon.missyou.exception.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * @author San
 * @time 2021/11/6 3:50 下午
 * @desc
 */

@ControllerAdvice
public class GlobalExceptionAdvice {

    @Autowired
    private ExceptionCodeConfiguration codeConfiguration;

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        String url = req.getRequestURL().toString();
        String method = req.getMethod();
        UnifyResponse m = new UnifyResponse(9999, "服务器异常", method + " " + url);
        System.out.println(e);
        return m;
    }

    @ExceptionHandler(value = HttpException.class)
    public ResponseEntity handleHttpException(HttpServletRequest req, HttpException e) {
        System.out.println(e);
        String url = req.getRequestURL().toString();
        String method = req.getMethod();
        UnifyResponse m = new UnifyResponse(e.getCode(), codeConfiguration.getMessage(e.getCode()), method + " " + url);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStatusCode());
        ResponseEntity<UnifyResponse> r = new ResponseEntity<UnifyResponse>(m, headers, httpStatus);
        return r;
    }
}
