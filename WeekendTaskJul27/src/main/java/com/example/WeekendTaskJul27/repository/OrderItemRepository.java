package com.example.WeekendTaskJul27.repository;


import com.example.WeekendTaskJul27.model.Order;
import com.example.WeekendTaskJul27.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    List<OrderItem> findByOrder(Order order);
}
