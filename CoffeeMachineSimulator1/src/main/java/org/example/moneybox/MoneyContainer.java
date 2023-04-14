package org.example.moneybox;

import org.example.coffeetype.Cappaccino;
import org.example.coffeetype.Expresso;
import org.example.coffeetype.ICoffee;
import org.example.coffeetype.Latte;
import org.example.enums.IngredientType;

public class MoneyContainer {


        static int  price=0;
   public  int getTotal_price(int cost){
         price+=cost;
         return price;
    }
}
