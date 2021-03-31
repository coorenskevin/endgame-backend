package com.example.demo.domain.service;

import com.example.demo.domain.db.ProductsForBoxRepository;
import com.example.demo.domain.model.ProductsForBox;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductsForService {

    @Autowired
    private ProductsForBoxRepository productsForRepository;

    public ProductsForBox add(ProductsForBox productsForBox) throws ServiceException {
        //check of box leeg is?
        return productsForRepository.save(productsForBox);
    }

    public Iterable<ProductsForBox> getAll() {
        return productsForRepository.findAll();
    }
}
