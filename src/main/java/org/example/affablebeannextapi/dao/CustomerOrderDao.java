package org.example.affablebeannextapi.dao;

import org.example.affablebeannextapi.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderDao extends JpaRepository<CustomerOrder,Integer> {
}
