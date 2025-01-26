package org.example.affablebeannextapi.dao;

import org.example.affablebeannextapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
