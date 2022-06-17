package com.BiFunctionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> bifunc=(a, b)->{
            return a*b;
        };
        System.out.println(bifunc.apply(10,5));
    }
}
