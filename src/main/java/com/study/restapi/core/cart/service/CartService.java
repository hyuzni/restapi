package com.study.restapi.core.cart.service;

import com.study.restapi.axiom.response.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    public ApiResponse<String> search() throws Exception {
        ApiResponse<String> response = null;
        if(true){
            response = ApiResponse.success("성공");
            throw new Exception("오류발생1");
        }
        return response;
    }

    public String search3() {
        return "세번째 함수";
    }
}
