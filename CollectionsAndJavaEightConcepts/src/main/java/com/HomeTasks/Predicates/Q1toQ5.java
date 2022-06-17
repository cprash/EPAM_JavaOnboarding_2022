package com.HomeTasks.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;


public class Q1toQ5 {
    public static void testCondition(Predicate<Product> pred, ArrayList<Product> arr){
        for(Product p:arr){
            if(pred.test(p))
                System.out.println(p.getName());

        }
    }
    public static void main(String[] args){
        ArrayList<Product> arr=new ArrayList<Product>();
        arr.add(new Product("Fan",50,"Electronics","A"));
        arr.add(new Product("Car",2000,"Automobile","B"));
        arr.add(new Product("Computer",250,"Electronics","C"));

        Predicate<Product> pred1=(product)->product.getPrice()>1000;
        Predicate<Product> pred2=(product)->product.getCategory().equalsIgnoreCase("Electronics");
        Predicate<Product> pred3=(product)->product.getPrice()>100;
        Predicate<Product> pred4=(product)->product.getPrice()<100;

        System.out.println("Products where Price greater than 1000 :");
        testCondition(pred1,arr);
        System.out.println("Products where category is Electronics :");
        testCondition(pred2,arr);
        System.out.println("Products where Price greater than 100 and category is Electronics :");
        testCondition(pred3.and(pred2),arr);
        System.out.println("Products where Price less than 100 and category is Electronics :");
        testCondition(pred4.and(pred2),arr);
    }



}
