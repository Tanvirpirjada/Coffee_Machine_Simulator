# Coffee Machine Simulator using Java and Strategy Design Pattern

## This is a console application built using Java programming language and Strategy Design Pattern. It simulates a coffee machine that can make different types of coffee and perform various operations such as filling ingredients, checking remaining ingredients, and taking money from the machine's money box.

# Features
* The coffee machine can make three types of coffee: Espresso, Latte, and Cappuccino, each with their specific recipe in terms of required ingredients and price.

* The coffee machine can store infinite amounts of milk, water, and coffee beans but initially contains nothing.

* The coffee machine has a money box that stores all the money it collects through selling but initially is empty.

* Users can select the type of coffee they want to buy and the coffee machine will dispense coffee only if it has enough ingredients to make that coffee; otherwise, it will show an error message.

* After coffee is dispensed, the money in the machine's money box will be updated as well as remaining ingredients.

* Users can fill the machine with ingredients as per their requirement.

* The machine's maintainer can take the money from the machine's money box.

* Users can check the remaining ingredients in the coffee machine.


* The application also has an analytics option that displays the count of all the coffees it sold, the amount it earned, and the ingredients it consumed.
Strategy Design Pattern

* The Strategy Design Pattern is used to implement the recipe for each type of coffee. Each type of coffee is defined as a separate strategy with its required ingredients and price. When the user selects a specific type of coffee, the corresponding strategy is invoked, and the coffee machine dispenses the coffee based on that strategy.


# How to Run

*To run the Coffee Machine Simulator, you need to have Java installed on your computer. Follow these steps:

Download the source code and extract it.
Open a terminal or command prompt and navigate to the directory where you extracted the code.
Compile the code using the following command:

javac Main.java
Run the application using the following command:

java Main

The application will start running, and you can follow the on-screen instructions to use the different features of the coffee machine.

# Conclusion
In this project, we created a Coffee Machine Simulator using Java and the Strategy Design Pattern. We learned how to implement a console application and use a design pattern to solve a real-world problem. The final application is user-friendly and easy to use, providing a great user experience.
