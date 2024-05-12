package com.yangche.orderservice.service;

import com.yangche.orderservice.model.Order;

public interface OrderService {

    Order getOrderDetail(Long orderId);
}
