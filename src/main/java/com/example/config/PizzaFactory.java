package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class PizzaFactory {

    @Value("${key.country}")
    private String country;

    private ApplicationContext applicationContext;

    public PizzaFactory() {
        applicationContext = new AnnotationConfigApplicationContext(
            CheesePizza.class,
            PepperoniPizza.class,
            VeggiePizza.class
        );
        
        System.out.println("PizzaFactory constructor:");
        
       
    }

    public Pizza createPizza(String type) {
        switch (country)
        {
            case "US":
            return applicationContext.getBean(CheesePizza.class);
            case "UK":
            return applicationContext.getBean(PepperoniPizza.class);
            case "AUS":
            return applicationContext.getBean(VeggiePizza.class);
            default: throw new IllegalArgumentException("No such pizza.");
        }
    }
}
