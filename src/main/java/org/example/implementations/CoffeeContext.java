package org.example.implementations;

import org.example.Interfaces.ICoffeeStreatagy;

public class CoffeeContext {
     ICoffeeStreatagy instance;
    void setCoffeeStrategy(String coffeeStrategy){
        if(coffeeStrategy.equals("Latte")){
            instance=new LatteStrategy();
        }
        else if(coffeeStrategy.equals("Cappaccinno")){
            instance=new CappaccinoStrategy();
        }
        else if(coffeeStrategy.equals("Expresso")){
          instance=new EspresssoStrategy();
        }
    }
      void buyCoffee() throws Throwable {
        instance.createCoffee();
      }
}
