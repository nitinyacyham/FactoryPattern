package com.example.config;

import org.springframework.context.annotation.Lazy;

@Lazy
public class VeggiePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}