package com.HomeTasks.ConsumerAndSupplier;

import com.HomeTasks.FunctionalInterface.Products;
import com.HomeTasks.Predicates.Product;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.*;


public class Q1toQ4 {

      public static void main(String[] args) {
        ArrayList<Productsss> arr = new ArrayList<Productsss>();
        arr.add(new Productsss("Fan", 50, "Electronics", "A"));
        arr.add(new Productsss("Car", 2000, "Automobile", "B"));
        arr.add(new Productsss("Computer", 250, "Electronics", "C"));
        arr.add(new Productsss("Iphone", 1250, "Electronics", "D"));
        arr.add(new Productsss("Truck", 3100, "Automobile", "D"));

          BiConsumer<ArrayList<Productsss>,String> consProd=(prodlist,str)->{
              for(Productsss pr:prodlist){
                  if(pr.getCategory().equalsIgnoreCase(str))
                      System.out.println("Q1.Product Details are as follows :"+pr.getName());
              }
          };

          Predicate<Productsss> pred1=(product)->product.getPrice()>1000;
          Predicate<Productsss> pred2=(product)->product.getPrice()>3000;

          BiConsumer<ArrayList<Productsss>,Predicate<Productsss>> consProd1=(prodlist,pred)->{
              for(Productsss pr:prodlist){
                  if(pred.test(pr)==true){
                      pr.setGrade("Premium");
                      System.out.println("Q2. "+pr.getName()+" "+pr.getGrade());
                  }
              }
          };

          BiConsumer<ArrayList<Productsss>,Predicate<Productsss>> consProd2=(prodlist,pred)->{
              for(Productsss pr:prodlist){
                  if(pred.test(pr)==true){
                      pr.setName(pr.getName()+"*");
                      System.out.println("Q3. "+pr.getName());
                  }
              }
          };

          Supplier<Productsss> newSup=()->{return new Productsss("Test1",2000);};

          Supplier<Integer> otp=()->{return new Random().nextInt(999999);
          };

          consProd.accept(arr,"Electronics");
          consProd1.accept(arr,pred1);
          consProd2.accept(arr,pred2);
          System.out.println("Q4."+newSup.get().getName());
          System.out.println("Q5."+otp.get());


    }


}
