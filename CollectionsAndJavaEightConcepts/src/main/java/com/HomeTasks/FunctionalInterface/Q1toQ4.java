package com.HomeTasks.FunctionalInterface;


import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;




public class Q1toQ4 {

      public static void main(String[] args) {
        ArrayList<Products> arr = new ArrayList<Products>();
        arr.add(new Products("Fan", 50, "Electronics", "A"));
        arr.add(new Products("Car", 2000, "Automobile", "B"));
        arr.add(new Products("Computer", 250, "Electronics", "C"));
        arr.add(new Products("Iphone", 1250, "Electronics", "D"));

        Predicate<Products> pred1 = (product) -> product.getPrice() > 1000;
        Predicate<Products> pred2 = (product) -> product.getCategory().equalsIgnoreCase("Electronics");

        Function<ArrayList<Products>, Float> getTotalCost = (prods) -> {
            float totalCost = 0;
            for (Products prod : prods) {
                totalCost = totalCost + prod.getPrice();
            }
            return totalCost;
        };

        BiFunction<Predicate<Products>, ArrayList<Products>, Float> getConditionalCost = (pred, prods) -> {
            float totalCost = 0;
            for (Products p : arr) {
                if (pred.test(p)) {
                    totalCost = totalCost + p.getPrice();
                }
            }
            return totalCost;
        };

        BiFunction<Predicate<Products>, ArrayList<Products>, ArrayList<String>> getConditionalProducts = (pred, prods) -> {
            ArrayList<String> condarr=new ArrayList<>();
            for (Products p : arr) {
                if (pred.test(p))
                    condarr.add(p.getName());

            }
            return condarr;
        };
        System.out.println("Q1.Total Cost of all products :" + getTotalCost.apply(arr));
        System.out.println("Q2. Total Cost of products Price>1000 and category Electronics: "+getConditionalCost.apply(pred1.and(pred2),arr));
        System.out.println("Q3. Total Cost of products  category Electronics: "+getConditionalCost.apply(pred2,arr));
        System.out.println("Q4. Products with price>1000 and category Electronics: "+getConditionalProducts.apply(pred1.and(pred2),arr));


    }


}
