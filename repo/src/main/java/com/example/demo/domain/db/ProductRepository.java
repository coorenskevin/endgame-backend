package com.example.demo.domain.db;

import com.example.demo.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findProductById(Long id);
}
