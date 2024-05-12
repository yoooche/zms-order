package com.yangche.orderservice.repository;

import com.yangche.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IOrderRepo extends JpaRepository<Order, Long> {

    @Query("select o from Order o where o.orderId = ?1")
    Order findByOrderId(Long orderId);

}