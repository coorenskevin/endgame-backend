package com.example.demo;

import com.example.demo.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@SpringBootApplication
public class test implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(test.class, args);
    }


    @Override
    public void run(String... args) {
        /*String sql = "SET search_path TO 'producten'; " +
                "INSERT INTO product (category, name, price, description, amountbought) VALUES (" + "'Food', 'Pasta', 2.50, 'A small box containing 250g of pasta.', 0)";
        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }*/

        String sql = "SET search_path TO 'producten;" +
                "SELECT * FROM product;";
        List<Product> producten = jdbcTemplate.query(
                sql, new BeanPropertyRowMapper(Product.class));
        System.out.println(producten);


    }

    /*private static final class ProductMapper implements RowMapper {
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setFirstName(rs.getString("first_name"));
            person.setLastName(rs.getString("last_name"));
            person.setEmail(rs.getString("email"));
            return person;
        }*/
}