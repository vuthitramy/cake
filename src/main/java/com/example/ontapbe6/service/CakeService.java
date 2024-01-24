package com.example.ontapbe6.service;


import com.example.ontapbe6.model.Cake;
import com.example.ontapbe6.repository.ICakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    public ICakeRepository cakeRepository;

    public List<Cake> getCakeList () {
        return cakeRepository.getCakeList ( );
    }

    public void createCake ( Cake cake ) {
        cakeRepository.createCake ( cake );
    }
}