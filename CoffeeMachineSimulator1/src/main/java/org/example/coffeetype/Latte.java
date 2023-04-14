package org.example.coffeetype;

import org.example.enums.IngredientType;
import org.example.moneybox.MoneyContainer;
import org.example.storage.IngredientStorage;

import java.util.HashMap;
import java.util.Map;

public class Latte implements ICoffee{


    IngredientStorage ingredientStorage;
    Map<IngredientType,Float> LatteIngredient=new HashMap<>();

    MoneyContainer moneyContainer=new MoneyContainer();
    public Latte(){
        LatteIngredient.put(IngredientType.MILK,75f);
        LatteIngredient.put(IngredientType.WATER,350f);
        LatteIngredient.put(IngredientType.BEANS,20f);
        ingredientStorage=IngredientStorage.getInstance();
    }
    @Override
    public void createCoffee() {
        if(ingredientAvailable()){
            consumeIngredient();
            System.out.println("Latte is ready to serve");
            System.out.println("You have to pay -> "+getPrice());
        }
        else{
            System.out.println("Ingredient is not available");
        }
    }

    @Override
    public int getPrice() {
        moneyContainer.getTotal_price(7);
        return 7;
    }

    @Override
    public boolean ingredientAvailable() {
        for(Map.Entry<IngredientType,Float> map : LatteIngredient.entrySet()){
            if(map.getValue()> ingredientStorage.getIngredient_quantity(map.getKey())){
                return false;
            }
        }
        return true;
    }

    @Override
    public void consumeIngredient() {
   for(Map.Entry<IngredientType,Float> map: LatteIngredient.entrySet()){
            ingredientStorage.consumeIngredient(map.getKey(),map.getValue());
        }
    }


}
