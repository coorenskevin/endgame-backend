package domain.service;

import domain.db.ProductRepository;
import domain.model.Product;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product add(Product product) throws ServiceException {
        //check of box leeg is?
        return productRepository.save(product);
    }

    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }
}
