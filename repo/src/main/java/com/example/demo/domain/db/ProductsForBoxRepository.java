package com.example.demo.domain.db;

import com.example.demo.domain.model.ProductsForBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductsForBoxRepository extends JpaRepository<ProductsForBox, Integer> {

}
