# Coffee Machine Simulator 

##  The Coffee Machine Simulator is a console-based application that allows users to manage a coffee machine that can make various types of coffee. The program uses the Strategy design pattern to enable users to choose different types of coffee and calculate the price and amount of ingredients required to make it. The program also uses object-oriented programming (OOPs) concepts such as encapsulation, abstraction, inheritance, and polymorphism to achieve its functionality.


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

# ScreenShots
![Screenshot (123)](https://user-images.githubusercontent.com/111841729/231751756-823034bf-9867-42ac-b6e5-584f79f58f0c.png)
![Screenshot (124)](https://user-images.githubusercontent.com/111841729/231751772-a49c7544-8a08-4ae7-a118-2f7eee183fca.png)
![Screenshot (125)](https://user-images.githubusercontent.com/111841729/231751812-6ad931f8-6082-4f6b-ba6c-9e55d7669768.png)
![Screenshot (126)](https://user-images.githubusercontent.com/111841729/231751850-be3a971e-f6b4-4130-a8d1-f463431127e7.png)
![Screenshot (127)](https://user-images.githubusercontent.com/111841729/231751865-f5f998ae-4038-4a09-b423-a717437dcf77.png)
![Screenshot (128)](https://user-images.githubusercontent.com/111841729/231751881-a53a91d5-cd10-41b4-a452-57bfb989d0e1.png)
![Screenshot (129)](https://user-images.githubusercontent.com/111841729/231751893-164fff51-662d-4309-873d-f641a9fad688.png)
![Screenshot (130)](https://user-images.githubusercontent.com/111841729/231751912-fbbcfe3c-4d15-438f-a4bf-5e0b2daf88e4.png)
[Screenshot (131)](https://user-images.githubusercontent.com/111841729/231751935-54b2d133-559c-4873-9a9f-cd82ddf07660.png)
![Screenshot (132)](https://user-images.githubusercontent.com/111841729/231751988-9fdf0a41-f8de-4f37-a5c7-b504b5415037.png)
![Screenshot (133)](https://user-images.githubusercontent.com/111841729/231752013-345b6089-d162-44cc-af8a-823dc07aa5eb.png)

# How to Run!


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
