package com.example.demo.domain.db;

import com.example.demo.domain.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BoxRepository extends JpaRepository<Box, Long> {
}
