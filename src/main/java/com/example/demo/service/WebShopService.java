package com.example.demo.service;

import com.example.demo.db.BoxRepository;
import com.example.demo.db.CustomerRepository;
import com.example.demo.db.ProductsForBoxRepository;
import com.example.demo.domain.Box;
import com.example.demo.domain.Customer;
import com.example.demo.domain.Product;
import com.example.demo.db.ProductRepository;
import com.example.demo.domain.ProductsForBox;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebShopService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    BoxRepository boxRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductsForBoxRepository productsForBoxRepository;

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

    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomer(String email){
        return customerRepository.findCustomerByEmail(email);
    };

    public Customer addCustomer(Customer customer) throws ServiceException {
        //check of box leeg is?
        if (customer == null){
            throw new ServiceException("Customer is null");
        }
        return customerRepository.save(customer);
    }

    public void deleteCustomer(String email) {
        Customer customer = this.getCustomer(email);
        if (customer != null){
            customerRepository.delete(customer);
        }
    }

    public Iterable<ProductsForBox> getAllProductsForBox(){
        return productsForBoxRepository.findAll();
    }

    public ProductsForBox getProductsForBox(Long id){
        return productsForBoxRepository.findProductsForBoxById(id);
    };

    public ProductsForBox addProductsForBox(ProductsForBox box) throws ServiceException {
        //check of box leeg is?
        if (box == null){
            throw new ServiceException("ProductForBox is null");
        }
        return productsForBoxRepository.save(box);
    }

    public void deleteProductsForBox(long id) {
        ProductsForBox box = this.getProductsForBox(id);
        if (box != null){
            productsForBoxRepository.delete(box);
        }
    }
}
