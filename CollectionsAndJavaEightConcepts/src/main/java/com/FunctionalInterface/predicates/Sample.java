package com.FunctionalInterface.predicates;

import java.util.function.Predicate;

public class Sample {

    public static void main(String[] args){
        Predicate<Integer> pred=(i)->i>10;
        System.out.println(pred.test(10));
        System.out.println(pred.test(9));
        System.out.println(pred.test(11));
    }
}
