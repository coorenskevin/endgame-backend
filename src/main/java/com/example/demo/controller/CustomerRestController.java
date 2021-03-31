package com.example.demo.controller;

import com.example.demo.domain.Customer;
import com.example.demo.service.WebShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/customer")
public class CustomerRestController {
    @Autowired
    private WebShopService service;

    @GetMapping("/all")
    public Iterable<Customer> overview(){
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("email") String email) {
        return service.getCustomer(email);
    }

    @PostMapping("/add")
    public void addCustomer(@Valid Customer customer){
        service.addCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable("email") String email) {
        if(service.getCustomer(email) != null) {
            service.deleteCustomer(email);
        }
    }
}
