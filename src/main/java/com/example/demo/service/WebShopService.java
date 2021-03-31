package com.example.demo.service;

import com.example.demo.db.BoxRepository;
import com.example.demo.domain.Box;
import com.example.demo.domain.Product;
import com.example.demo.db.ProductRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebShopService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    BoxRepository boxRepository;

    public Iterable<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProduct(Long id){
        return productRepository.findProductById(id);
    };

    public Product addProduct(Product product) throws ServiceException {
        //check of box leeg is?
        if (product == null){
            throw new ServiceException("Product is null");
        }
        return productRepository.save(product);
    }

    public void deleteProduct(long id) {
        Product product = null;
        product = this.getProduct(id);
        if (product != null){
            productRepository.delete(product);
        }
    }

    public Iterable<Box> getAllBoxes(){
        return boxRepository.findAll();
    }

    public Box getBox(Long id){
        return boxRepository.findBoxById(id);
    };

    public Box addBox(Box box) throws ServiceException {
        //check of box leeg is?
        if (box == null){
            throw new ServiceException("Box is null");
        }
        return boxRepository.save(box);
    }

    public void deleteBox(long id) {
        Box box = this.getBox(id);
        if (box != null){
            boxRepository.delete(box);
        }
    }
}
