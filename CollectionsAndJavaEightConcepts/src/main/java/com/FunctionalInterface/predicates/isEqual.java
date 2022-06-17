package com.FunctionalInterface.predicates;

import java.util.function.Predicate;

public class isEqual {
    public static void main(String[] args){
        Predicate<String> pred=Predicate.isEqual("Test");

        System.out.println(pred.test("Test"));
    }
}
