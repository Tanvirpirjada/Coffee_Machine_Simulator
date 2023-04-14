package org.example.coffeetype;

import org.example.enums.IngredientType;
import org.example.moneybox.MoneyContainer;
import org.example.storage.IngredientStorage;

import java.util.HashMap;
import java.util.Map;

public class Cappaccino implements ICoffee{


      IngredientStorage ingredientStorage;
    Map<IngredientType,Float> cappaccinoIngredient=new HashMap<>();


    MoneyContainer moneyContainer=new MoneyContainer();
    public Cappaccino(){
        cappaccinoIngredient.put(IngredientType.MILK,100f);
        cappaccinoIngredient.put(IngredientType.WATER,200f);
        cappaccinoIngredient.put(IngredientType.BEANS,12f);
        ingredientStorage=IngredientStorage.getInstance();
    }
    @Override
    public void createCoffee() {
        if(ingredientAvailable()){
            consumeIngredient();
            System.out.println("Capaaccino is ready to serve");
            System.out.println("You have to pay -> "+getPrice());
        }
        else{
              System.out.println("Ingredient is not available");
        }
    }

    @Override
    public int getPrice() {
        moneyContainer.getTotal_price(6);
        return 6;
    }

    @Override
    public boolean ingredientAvailable() {
        for(Map.Entry<IngredientType,Float> map : cappaccinoIngredient.entrySet()){
            if(map.getValue()> ingredientStorage.getIngredient_quantity(map.getKey())){
                return false;
            }
        }
        return true;
    }

    @Override
    public void consumeIngredient() {
          for(Map.Entry<IngredientType,Float> map: cappaccinoIngredient.entrySet()){
              ingredientStorage.consumeIngredient(map.getKey(),map.getValue());
          }
    }

//    private void consumeIngredients() {
//        for(Map.Entry<IngredientType, Float> mapEntry : ingredient_quantity.entrySet()) {
//            ingredientHolder.reduceIngredient(mapEntry.getKey(), mapEntry.getValue());
//        }
//    }


}
