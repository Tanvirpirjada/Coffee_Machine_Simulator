package org.example.coffeetype;

import org.example.enums.IngredientType;
import org.example.moneybox.MoneyContainer;
import org.example.storage.IngredientStorage;

import java.util.HashMap;
import java.util.Map;

public class Expresso implements ICoffee{

    IngredientStorage ingredientStorage;
    Map<IngredientType,Float> ExpressoIngredient=new HashMap<>();

    MoneyContainer moneyContainer=new MoneyContainer();
    public Expresso(){
        ExpressoIngredient.put(IngredientType.MILK,0f);
        ExpressoIngredient.put(IngredientType.WATER,250f);
        ExpressoIngredient.put(IngredientType.BEANS,16f);
        ingredientStorage=IngredientStorage.getInstance();
    }
    @Override
    public void createCoffee() {
        if(ingredientAvailable()){
            consumeIngredient();
            System.out.println("Expresso is ready to serve");
            System.out.println("You have to pay -> "+getPrice());
        }
        else{
            System.out.println("Ingredient is not available");
        }

    }

    @Override
    public int getPrice() {
        moneyContainer.getTotal_price(4);
        return 4;
    }

    @Override
    public boolean ingredientAvailable() {
        for(Map.Entry<IngredientType,Float> map : ExpressoIngredient.entrySet()){
            if(map.getValue()> ingredientStorage.getIngredient_quantity(map.getKey())){
                return false;
            }
        }
        return true;
    }

    @Override
    public void consumeIngredient() {
        for(Map.Entry<IngredientType,Float> map: ExpressoIngredient.entrySet()){
            ingredientStorage.consumeIngredient(map.getKey(),map.getValue());
        }
    }


}
