package com.yangche.orderservice.controller;

import com.yangche.orderservice.model.Order;
import com.yangche.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public Order getOrderDetail(@RequestParam("orderId") Long orderId) {
        return orderService.getOrderDetail(orderId);
    }

}