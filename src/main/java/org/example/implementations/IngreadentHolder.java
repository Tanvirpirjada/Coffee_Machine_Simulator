package org.example.implementations;

import org.example.enums.CoffeeType;
import org.example.enums.IngredientType;

import java.util.HashMap;
import java.util.Map;

public class IngreadentHolder {
     private  static  IngreadentHolder instance;
    private  Map<IngredientType,Float> ingredient_quantity=new HashMap<>();
    //we make it singleton
    private IngreadentHolder(){
        ingredient_quantity.put(IngredientType.WATER,0.0f);
        ingredient_quantity.put(IngredientType.MILK,0.0f);
        ingredient_quantity.put(IngredientType.BEANS,0.0f);
    }

      public static  IngreadentHolder getInstance(){
         if(instance==null){
             instance= new IngreadentHolder();
         }
         return instance;
      }

      public void setIngredient_quantity(IngredientType ingredientType,Float quantity){
        ingredient_quantity.put(ingredientType,ingredient_quantity.get(ingredientType)+quantity);
      }

      public void reduceIngredient(IngredientType ingredientType, Float quantity){
        ingredient_quantity.put(ingredientType,ingredient_quantity.get(ingredientType)-quantity);
      }


      public Float getIngreadient(IngredientType ingredientType){
        return ingredient_quantity.get(ingredientType);
      }

}
