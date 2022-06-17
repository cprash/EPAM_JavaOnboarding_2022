package com.FunctionalInterface.Function;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args){
        Function<String,Integer> func=(str)->str.length();
        System.out.println("Length of String :"+func.apply("Test"));
    }
}
