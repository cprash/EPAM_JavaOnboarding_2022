package com.BiFunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args){
        BiPredicate<Integer,Integer> bipred=(a,b)->{
            return a%b==0;
        };
        System.out.println(bipred.test(10,2));
        System.out.println(bipred.test(11,2));
    }
}
