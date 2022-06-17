package com.HomeTasks.Streams;

import com.HomeTasks.Streams.Productssss;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Q1toQ4 {



    public static void main(String[] args) {
        ArrayList<Productssss> arr = new ArrayList<Productssss>();
        arr.add(new Productssss("Fan", 50, "Electronics", "A"));
        arr.add(new Productssss("Car", 2000, "Automobile", "B"));
        arr.add(new Productssss("Computer", 250, "Electronics", "C"));
        arr.add(new Productssss("Iphone", 1250, "Electronics", "D"));

        Predicate<Productssss> pred1 = (product) -> product.getPrice() > 1000;
        Predicate<Productssss> pred2 = (product) -> product.getCategory().equalsIgnoreCase("Electronics");
        System.out.println("Q1");
        arr.stream().filter(pred1).forEach((product)-> System.out.println(product.getName()));
        System.out.println("Q2");
        arr.stream().filter(pred2).forEach((product)-> System.out.println(product.getName()));
        System.out.println("Q3");
        arr.stream().filter(pred1.and(pred2)).forEach((product)-> System.out.println(product.getName()));
        System.out.println("Q4");
        System.out.println(arr.stream().filter(pred2).collect(Collectors.toList()).size());



    }


}
