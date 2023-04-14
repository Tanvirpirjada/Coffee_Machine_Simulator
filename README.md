# Coffee_Machine_Simulator

## This is a REPL (Read, Eval, Print, Loop) console application in Python that simulates a coffee machine. The program allows the user to buy coffee, add ingredients, take money, display the remaining ingredients, and view analytics. The program is designed using Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, and polymorphism.

# ScreenShots

![Screenshot (134)](https://user-images.githubusercontent.com/111841729/232112170-ee37b3ac-ce0c-4ece-9894-113b3bfbaf93.png)
![Screenshot (135)](https://user-images.githubusercontent.com/111841729/232112179-6366dbab-0d33-4c7d-8ed6-904e05c00620.png)
![Screenshot (136)](https://user-images.githubusercontent.com/111841729/232112202-8a6689af-a88d-41d4-a07e-6009a4389292.png)
![Screenshot (137)](https://user-images.githubusercontent.com/111841729/232112220-e478982f-f7f0-42ec-aa02-f965651a8e49.png)
![Screenshot (138)](https://user-images.githubusercontent.com/111841729/232112245-00575c33-544e-4d28-888b-e9be5cad1db1.png)
![Screenshot (139)](https://user-images.githubusercontent.com/111841729/232112265-0ff80f3e-f98a-49c6-9844-03facd4f12ae.png)
![Screenshot (140)](https://user-images.githubusercontent.com/111841729/232112292-4b6c4bfc-344a-41d7-91fe-2e1f1c6e3666.png)
![Screenshot (141)](https://user-images.githubusercontent.com/111841729/232112309-d2ab5dde-fa83-4bc7-9cef-b9d26b1c7868.png)
![Screenshot (142)](https://user-images.githubusercontent.com/111841729/232112342-074bda31-be04-472f-97d1-1e8570e79753.png)
![Screenshot (143)](https://user-images.githubusercontent.com/111841729/232112355-992a1915-f0ce-4431-b9a7-741dd7e4fdc8.png)
![Screenshot (144)](https://user-images.githubusercontent.com/111841729/232112375-52fc1764-59f6-4043-98f9-5c62b8d03298.png)

# Coffee Machine Features

## Ingredients

The coffee machine contains the following ingredients:

* Water

* Milk

* Coffee beans
The machine can hold an infinite amount of these ingredients but initially contains nothing.

## Money Box
The coffee machine contains a money box that stores all the money it collects through selling. Initially, the money box is empty.

## Coffee Types
The coffee machine supports the following types of coffee:

## Espresso
Price: $4/cup
Water needed: 250 ml/cup
Milk needed: 0 ml/cup
Coffee beans needed: 16/cup
## Latte
Price: $7/cup
Water needed: 350 ml/cup
Milk needed: 75 ml/cup
Coffee beans needed: 20/cup
## Cappuccino
Price: $6/cup
Water needed: 200 ml/cup
Milk needed: 100 ml/cup
Coffee beans needed: 12/cup

## Buy Option
The program allows the user to buy a coffee of their choice. The coffee is dispensed only if the machine contains enough ingredients to make that coffee. Otherwise, an error message is displayed. After the coffee is dispensed, the money in the money box is updated as well as the remaining ingredients.

## Fill Option
The program allows the user to add ingredients to the coffee machine as per their requirement.

## Take Option
The program allows the maintainer to take the money in the money box.



## Analytics Option
The program allows the user to view the following analytics:

* Amount earned

* Ingredients consumed

# Object-Oriented Programming (OOP) Concepts

## Encapsulation
The coffee machine's data and methods are encapsulated within the CoffeeMachine class, and they can only be accessed through the class's methods. This ensures that the data is not modified unintentionally, and the program's behavior is consistent.



# Polymorphism
The CoffeeMachine a classes implement polymorphism through their common interface, CoffeeInterface. This interface defines the methods that must be implemented by both classes. This polymorphism allows the program to use either class interchangeably wherever the CoffeeInterface is used.

# Conclusion
This program demonstrates the use of Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, and polymorphism. The program simulates a coffee machine with the ability to buy coffee, add ingredients, take money, display the remaining ingredients, and view analytics. The program's design allows for code reuse, consistency, and easy modification.
