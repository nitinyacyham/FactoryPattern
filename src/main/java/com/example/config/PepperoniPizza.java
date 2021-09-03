package com.example.config;

import org.springframework.context.annotation.Lazy;

@Lazy
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        System.out.println("PepperoniPizza constructor");
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
