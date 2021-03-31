package com.example.demo;
import com.example.demo.domain.db.ProductRepository;
import com.example.demo.domain.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

    @Bean
    public CommandLineRunner demo(ProductRepository repository) {
        return (args) -> {

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Product product : repository.findAll()) {
                System.out.println(product);
            }
            log.info("");




        };
    }

}