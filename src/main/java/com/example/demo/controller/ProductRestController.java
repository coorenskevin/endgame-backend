package com.example.demo.controller;

import com.example.demo.domain.Product;
import com.example.demo.service.WebShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/products")
public class ProductRestController {
    @Autowired
    private WebShopService service;

    @GetMapping("/all")
    public Iterable<Product> overview(){
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") long id) {
        return service.getProduct(id);
    }

    @PostMapping("/add")
    public void addProduct(@Valid Product product){
        service.addProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") long id) {
        if(service.getProduct(id) != null) {
            service.deleteProduct(id);
        }
    }
}
