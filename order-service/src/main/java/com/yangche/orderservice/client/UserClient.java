package com.yangche.orderservice.client;

import com.yangche.orderservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/user")
    User getUserDetail(@RequestParam("userId") Long id);
}