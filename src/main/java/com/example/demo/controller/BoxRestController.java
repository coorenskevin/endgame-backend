package com.example.demo.controller;

import com.example.demo.domain.Box;
import com.example.demo.domain.Product;
import com.example.demo.service.WebShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/box")
public class BoxRestController {
    @Autowired
    private WebShopService service;

    @GetMapping("/all")
    public Iterable<Box> overview(){
        return service.getAllBoxes();
    }

    @GetMapping("/{id}")
    public Box getBox(@PathVariable("id") long id) {
        return service.getBox(id);
    }

    @PostMapping("/add")
    public void addBox(@Valid Box box){
        service.addBox(box);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBox(@PathVariable("id") long id) {
        if(service.getBox(id) != null) {
            service.deleteBox(id);
        }
    }
}
