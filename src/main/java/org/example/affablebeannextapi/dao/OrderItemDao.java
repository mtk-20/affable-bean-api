package org.example.affablebeannextapi.dao;

import org.example.affablebeannextapi.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDao extends JpaRepository<OrderItem,Integer> {
}
