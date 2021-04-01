package com.example.demo.ui.controller;

import com.example.demo.domain.model.ProductsForBox;
import com.example.demo.domain.service.WebShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/productsforbox")
public class ProductsForBoxRestController {
    @Autowired
    private WebShopService service;

    @GetMapping("/all")
    public Iterable<ProductsForBox> overview(){
        return service.getAllProductsForBox();
    }

    @GetMapping("/{id}")
    public ProductsForBox getBox(@PathVariable("id") long id) {
        return service.getProductsForBox(id);
    }

    @PostMapping("/add")
    public void addBox(@Valid ProductsForBox box){
        service.addProductsForBox(box);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBox(@PathVariable("id") long id) {
        if(service.getProductsForBox(id) != null) {
            service.deleteProductsForBox(id);
        }
    }
}
