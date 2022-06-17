package com.Pizza;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Manager {

    public static  void main(String[] args)
    {

        Scanner baseType =new Scanner(System.in);
        Scanner pizzaToppingFLag =new Scanner(System.in);
        Scanner pizzaTopping =new Scanner(System.in);
        HashSet<String> pizzaToppings=new HashSet<String>();
        Pizza newPizza= new Pizza();
        System.out.println("###PIZZA MENU###");
        System.out.println("Order Your Pizza ");

        System.out.println("Select Base Type:");
        System.out.println("1. Standard Base [Price: 30.0]");
        System.out.println("2. Soft Base [Price: 40.0]");
        String baseTypeSelected=baseType.nextLine();

        switch(baseTypeSelected){
               case "1": newPizza.setBaseType("Standard Base");break;
               case "2": newPizza.setBaseType("Soft Base");
            }

            System.out.println("Add toppings :");
            do {
                System.out.println("Select Topping:");
                System.out.println("1. Tomato [Price: 10.0]");
                System.out.println("2. Corn [Price: 15.0]");
                System.out.println("3. Mushroom [Price: 25.0]");
                String pizzaToppingSelected = pizzaTopping.nextLine();
                switch(pizzaToppingSelected){
                    case "1": pizzaToppings.add("Tomato");break;
                    case "2": pizzaToppings.add("Corn");break;
                    case "3": pizzaToppings.add("Mushroom");
                }
                System.out.println("Do you want to add another topping y/n :");

            }while(pizzaToppingFLag.nextLine().equalsIgnoreCase("y"));
            newPizza.setToppings(pizzaToppings);
            System.out.println("Your Order :");
            System.out.println(newPizza.getBaseType());
            System.out.println(newPizza.getToppings());
            System.out.println("Your total Bill :" + newPizza.calculatePizzaPrice());

    }


}
