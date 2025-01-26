package org.example.affablebeannextapi.dao;

import org.example.affablebeannextapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}
