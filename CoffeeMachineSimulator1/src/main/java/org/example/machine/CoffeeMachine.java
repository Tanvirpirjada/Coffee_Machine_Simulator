package org.example.machine;

import org.example.coffeetype.Cappaccino;
import org.example.coffeetype.Expresso;
import org.example.coffeetype.ICoffee;
import org.example.coffeetype.Latte;
import org.example.enums.IngredientType;
import org.example.moneybox.MoneyContainer;
import org.example.storage.IngredientStorage;

import java.util.Map;

public class CoffeeMachine {

    ICoffee coffee;
    MoneyContainer moneyContainer=new MoneyContainer();
    IngredientStorage ingredientStorage=IngredientStorage.getInstance();
   public void fill_ingredient(Map<IngredientType,Float> map){
        ingredientStorage.setIngredient(map);
    }

   public  void buyCoffee(String name){
        if(name.equals("Latte")){
            coffee=new Latte();
            coffee.createCoffee();
        }
        else if(name.equals("Cappacciono")){
            coffee=new Cappaccino();
            coffee.createCoffee();
        }
        else if(name.equals("Expresso")){
            coffee=new Expresso();
            coffee.createCoffee();
        }
        else {
            System.out.print("Type Not Available");
        }
    }

    public void availableIngredient(IngredientType ingredientType){
       System.out.print(ingredientStorage.getIngredient_quantity(ingredientType));
    }


    public int total_collection(){
      return moneyContainer.getTotal_price(0);
    }
}
