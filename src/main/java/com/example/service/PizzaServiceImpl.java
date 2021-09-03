package com.example.service;

import com.example.config.Pizza;
import com.example.config.PizzaFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServiceImpl implements PizzaService{

    @Autowired
    PizzaFactory factory;

    @Override
    public Pizza getPizza() {
        return factory.createPizza("pepperoni");
    }
    
}
