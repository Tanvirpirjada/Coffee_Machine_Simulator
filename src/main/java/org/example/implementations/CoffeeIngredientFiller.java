package org.example.implementations;

import org.example.Interfaces.ICoffeeStreatagy;
import org.example.Interfaces.IIngredientFiller;
import org.example.enums.IngredientType;

public class CoffeeIngredientFiller implements IIngredientFiller {
   private  IngreadentHolder ingreadentHolder;
    CoffeeIngredientFiller(){
        ingreadentHolder =IngreadentHolder.getInstance();
    }
    @Override
    public void fill(IngredientType ingredientType, Float quantity) {
               ingreadentHolder.setIngredient_quantity(ingredientType,quantity);
    }
}
