package com.study.restapi.axiom.response;

import com.study.restapi.core.code.ResponseCode;
import lombok.Getter;

@Getter
public class ApiResponse<E> {

    private Boolean success;
    private String message;
    private E data;
    private String code;

    private ApiResponse(Boolean success, String message, E data, String code){
        this.success = success;
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public static <E> ApiResponse<E> success(E data){
        return new ApiResponse<E>(true, ResponseCode.SUCCESS.getResponseCodeDescription(), data, ResponseCode.SUCCESS.name()); // enum
    }

    public static <E> ApiResponse<E> error(String message){
        return new ApiResponse<E>(true, message, null, ResponseCode.ERROR.name()); // enum
    }


}
