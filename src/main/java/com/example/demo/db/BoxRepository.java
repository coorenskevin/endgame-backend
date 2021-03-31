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

package com.example.demo.db;

import com.example.demo.domain.Box;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxRepository extends JpaRepository<Box, Long> {
    public Box findBoxById(Long id);
}
