package org.example;

import org.example.enums.IngredientType;
import org.example.implementations.coffeeMachine;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        coffeeMachine coffeeMachine = new coffeeMachine();
        Map<IngredientType, Float> map = new HashMap<>();
        map.put(IngredientType.WATER, 1000.0f);
        map.put(IngredientType.MILK, 500.0f);
        map.put(IngredientType.BEANS, 100.0f);
        coffeeMachine.setCoffeeIngredientFiller(map);

        try {
            coffeeMachine.Coffee("Latte");
            coffeeMachine.Coffee("Cappaccinno");
            coffeeMachine.Coffee("Expresso");
            //coffeeMachine.Coffee("Latte");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }


    }
}