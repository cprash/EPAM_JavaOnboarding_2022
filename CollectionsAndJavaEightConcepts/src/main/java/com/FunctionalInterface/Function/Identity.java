package com.FunctionalInterface.Function;

import java.util.function.Function;

public class Identity {
    public static void main(String[] args){
        Function<String,String> func=Function.identity();
        System.out.println(func.apply("Test"));
    }
}
