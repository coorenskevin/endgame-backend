/**
 * Copyright (c) 2021
 * <p>
 * long description for the file
 *
 * @summary short description for the file
 * @author Kevin Coorens <kevin.coorens@student.be>
 * <p>
 * Created at     : 31/03/2021 19:45
 */

package com.example.demo.domain.db;

import com.example.demo.domain.model.ProductsForBox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsForBoxRepository extends JpaRepository<ProductsForBox, Long> {
    public ProductsForBox findProductsForBoxById(Long id);
}
