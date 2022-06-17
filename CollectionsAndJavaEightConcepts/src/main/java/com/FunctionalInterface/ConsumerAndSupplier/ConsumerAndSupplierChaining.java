package com.FunctionalInterface.ConsumerAndSupplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplierChaining {
    public static void main(String[] args){
        Consumer<String> cons1=(str)->System.out.println(str.length());
        Consumer<String> cons2=(str)->System.out.println(str.substring(0,3));

        cons1.andThen(cons2).accept("TestingAutomated");
        cons2.andThen(cons1).accept("TestingAutomated");


        Supplier<Integer> supp=()->10;
        System.out.println(supp.get());
    }
}
