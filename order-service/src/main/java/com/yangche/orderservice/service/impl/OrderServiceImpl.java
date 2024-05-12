package com.yangche.orderservice.service.impl;

import com.yangche.orderservice.client.UserClient;
import com.yangche.orderservice.model.Order;
import com.yangche.orderservice.repository.IOrderRepo;
import com.yangche.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private IOrderRepo orderRepo;

    @Autowired
    private UserClient userClient;

    @Override
    public Order getOrderDetail(Long orderId) {
        var order = orderRepo.findByOrderId(orderId);
        order.setUser(userClient.getUserDetail(order.getUserId()));
        return order;
    }
}