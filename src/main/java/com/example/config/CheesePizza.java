package com.example.config;

import org.springframework.context.annotation.Lazy;

@Lazy
public class CheesePizza extends Pizza {
    
    
    public CheesePizza() {
    System.out.println("cheese pizza constructor");
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}