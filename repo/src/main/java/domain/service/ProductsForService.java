package domain.service;

import domain.db.ProductsForRepository;
import domain.model.ProductsForBox;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductsForService {

    @Autowired
    private ProductsForRepository productsForRepository;

    public ProductsForBox add(ProductsForBox productsForBox) throws ServiceException {
        //check of box leeg is?
        return productsForRepository.save(productsForBox);
    }

    public Iterable<ProductsForBox> getAll() {
        return productsForRepository.findAll();
    }
}
