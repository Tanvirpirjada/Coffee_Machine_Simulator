package org.example;

import org.example.enums.IngredientType;
import org.example.machine.CoffeeMachine;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        CoffeeMachine m1=new CoffeeMachine();
        Map<IngredientType,Float> map=new HashMap<>();
        map.put(IngredientType.WATER,1000f);
        map.put(IngredientType.MILK,1000f);
        map.put(IngredientType.BEANS,500f);
        m1.fill_ingredient(map);
        m1.buyCoffee("Cappacciono");
        m1.buyCoffee("Latte");
        m1.buyCoffee("Expresso");
        m1.buyCoffee("Latte");
        System.out.println("Total money to pay : " + m1.total_collection());

    }
}