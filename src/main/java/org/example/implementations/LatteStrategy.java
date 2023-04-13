package org.example.implementations;

import org.example.Interfaces.ICoffeeStreatagy;
import org.example.enums.IngredientType;


import java.util.HashMap;
import java.util.Map;

public class LatteStrategy implements ICoffeeStreatagy {

    private Map<IngredientType, Float> ingredient_quantity = new HashMap<>();

    private IngreadentHolder ingredientHolder;

    public LatteStrategy() {
        ingredient_quantity.put(IngredientType.WATER, 350f);
        ingredient_quantity.put(IngredientType.MILK, 75f);
        ingredient_quantity.put(IngredientType.BEANS, 20f);
        ingredientHolder = IngreadentHolder.getInstance();
    }

    @Override
    public void createCoffee() {
        if(checkIngredient()) {
            consumeIngredients();
            System.out.println("Latte is ready");
        } else {
            throw new RuntimeException("Ingredient for Latte is not sufficient");
        }
    }

    @Override
    public boolean checkIngredient() {
        for(Map.Entry<IngredientType, Float> mapEntry : ingredient_quantity.entrySet()) {
            if(ingredientHolder.getIngreadient(mapEntry.getKey()) < mapEntry.getValue())
                return false;
        }
        return true;
    }

    @Override
    public int price() {
        return 7;
    }

    private void consumeIngredients() {
        for(Map.Entry<IngredientType, Float> mapEntry : ingredient_quantity.entrySet()) {
            ingredientHolder.reduceIngredient(mapEntry.getKey(), mapEntry.getValue());
        }
    }
    }

