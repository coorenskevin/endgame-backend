package com.example.demo.domain.service;


import com.example.demo.domain.db.CustomerRepository;
import com.example.demo.domain.model.Customer;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer add(Customer customer) throws ServiceException {
        //check of box leeg is?
        return customerRepository.save(customer);
    }

    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }
}
