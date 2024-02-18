package com.study.restapi.core.code;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.net.http.HttpClient;

public enum ResponseCode {

    SUCCESS("성공!", HttpStatus.OK),
    ERROR("실패!", HttpStatus.BAD_REQUEST);
    private final String description;
    private final HttpStatus statusCode;

    ResponseCode (String description, HttpStatus statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    };
    public String getResponseCodeDescription(){
        return this.description;
    };
    public HttpStatus getStatusCode(){
        return this.statusCode;
    };
}
