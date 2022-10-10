package com.example.pizza;

import ConstituentsOfPizza.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaApplication {

    public static void main(String[] args) {
        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());

    }

}
