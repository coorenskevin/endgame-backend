package com.example.demo.domain.service;

import com.example.demo.domain.db.BoxRepository;
import com.example.demo.domain.model.Box;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoxService {

    @Autowired
    private BoxRepository boxRepository;

    public Box add(Box box) throws ServiceException {
        //check of box leeg is?
        return boxRepository.save(box);
    }

    public Iterable<Box> getAll() {
        return boxRepository.findAll();
    }

}
