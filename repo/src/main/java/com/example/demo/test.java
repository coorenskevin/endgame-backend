package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class test implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(test.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "SET search_path TO 'producten'; " +
                "INSERT INTO product (category, name, price, description, amountbought) VALUES (" + "'Food', 'Pasta', 2.50, 'A small box containing 250g of pasta.', 0)";
        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
    }
}