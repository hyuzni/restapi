package com.study.restapi.web.v1.cart;

import com.study.restapi.axiom.response.ApiResponse;
import com.study.restapi.core.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/v1")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/cart")
    public ApiResponse<String> Search() {
        return ApiResponse.success("im cart");
    }

    @GetMapping("/cart2")
    public ApiResponse<?> Search2() throws Exception {
        return cartService.search();
    }

    @GetMapping("/test")
    public ResponseEntity<ApiResponse<String>> Search3() {

        return ResponseEntity.ok(ApiResponse.success(cartService.search3()));
    }
}
