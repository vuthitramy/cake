package com.example.ontapbe6.repository;


import com.example.ontapbe6.model.Cake;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ICakeRepository {
    List<Cake> list = new ArrayList<> ( );


    public List<Cake> getCakeList () {
        return list;
    }

    public void createCake ( Cake cake ) {
        list.add ( cake );
    }
}