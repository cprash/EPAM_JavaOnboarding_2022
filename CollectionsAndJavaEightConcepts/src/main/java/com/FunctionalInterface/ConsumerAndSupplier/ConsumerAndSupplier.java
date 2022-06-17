package com.FunctionalInterface.ConsumerAndSupplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {
    public static void main(String[] args){
        Consumer<String> cons=(str)->System.out.println(str.length());

        cons.accept("Test");

        Supplier<Integer> supp=()->10;
        System.out.println(supp.get());
    }
}
