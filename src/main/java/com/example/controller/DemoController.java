package com.example.controller;

import com.example.config.Pizza;
import com.example.service.PizzaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {

    @Autowired
    PizzaService service;

    @GetMapping("/pizza")
    public ResponseEntity<String> getAll() {
        Pizza pizza = service.getPizza();
        pizza.addIngredients();
        pizza.bakePizza();
        
        
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }
}
