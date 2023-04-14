package org.example.storage;

import org.example.enums.IngredientType;

import java.util.HashMap;
import java.util.Map;

public class IngredientStorage {

private static IngredientStorage ingredientStorage;

 private Map<IngredientType,Float> ingredients=new HashMap<>();
private IngredientStorage(){
        ingredients.put(IngredientType.BEANS,0f);
        ingredients.put(IngredientType.WATER,0f);
        ingredients.put(IngredientType.MILK,0f);
}

public static IngredientStorage getInstance(){

    if(ingredientStorage==null){
         ingredientStorage=new IngredientStorage();
    }
    return ingredientStorage;
}


     public void setIngredient(Map<IngredientType,Float> ingredientmap){
       for(Map.Entry<IngredientType,Float> map : ingredientmap.entrySet()){
           ingredients.put(map.getKey(), ingredients.get(map.getKey())+map.getValue());
       }
     }

     public float getIngredient_quantity(IngredientType ingredientType){
        return  ingredients.get(ingredientType);
     }



    public void consumeIngredient(IngredientType key, Float value) {
    ingredients.put(key,ingredients.get(key)-value);
    }

}
