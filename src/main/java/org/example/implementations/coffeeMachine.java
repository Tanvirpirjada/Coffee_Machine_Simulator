package org.example.implementations;

import org.example.enums.IngredientType;


import java.util.Map;

public class coffeeMachine {

    private CoffeeIngredientFiller coffeeIngredientFiller;

    private CoffeeContext coffeeContext;

    public coffeeMachine(){
        coffeeIngredientFiller=new CoffeeIngredientFiller();
        coffeeContext=new CoffeeContext();
    }

    public void Coffee(String type) throws Throwable {
        coffeeContext.setCoffeeStrategy(type);
        coffeeContext.buyCoffee();
    }

   public  void setCoffeeIngredientFiller(Map<IngredientType,Float> ingredientType){
        for(Map.Entry<IngredientType,Float> map: ingredientType.entrySet()){
            coffeeIngredientFiller.fill(map.getKey(), map.getValue());
        }

    }
}
