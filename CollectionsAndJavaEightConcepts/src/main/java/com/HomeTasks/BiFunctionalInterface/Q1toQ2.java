package com.HomeTasks.BiFunctionalInterface;

import com.HomeTasks.FunctionalInterface.Products;

import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


public class Q1toQ2 {



    public static void main(String[] args) {
        ArrayList<Productss> arr = new ArrayList<Productss>();
        arr.add(new Productss("Fan", 50, "Electronics", "A"));
        arr.add(new Productss("Car", 2000, "Automobile", "B"));
        arr.add(new Productss("Computer", 250, "Electronics", "C"));
        arr.add(new Productss("Iphone", 1250, "Electronics", "D"));

        BiFunction<String, Float,Productss> newProd=(name,price)->{
            return new Productss(name,price);
        };

        Map<Productss,Integer> cart=new HashMap<>();
        cart.put(arr.get(0),3);
        cart.put(arr.get(1),2);
        cart.put(arr.get(2),4);
        cart.put(arr.get(3),1);

        Function<Map<Productss,Integer>,Float> calCartCost=(carthM)->{
            float cartCost=0;
            for(Map.Entry<Productss,Integer> m:carthM.entrySet()){
                System.out.println(m.getKey().getPrice()+" "+m.getValue());
                cartCost=cartCost+m.getKey().getPrice()*m.getValue();
            }
            return cartCost;
        };


        newProd.apply("TV", 500F);

        System.out.println("Cart Cost : "+calCartCost.apply(cart));

    }


}
