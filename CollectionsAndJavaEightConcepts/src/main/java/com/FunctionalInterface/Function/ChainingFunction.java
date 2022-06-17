package com.FunctionalInterface.Function;

import java.util.Locale;
import java.util.function.Function;

public class ChainingFunction {
    public static void main(String[] args ){
        Function<String,String> f1=(str)->str.toUpperCase();
        Function<String,String> f2=(str)->str.substring(0,5);

        System.out.println("Result of F1 : "+f1.apply("JavaEightSession"));
        System.out.println("Result of F2 : "+f2.apply("JavaEightSession"));

        System.out.println(f1.andThen(f2).apply("JavaEightSession"));
        System.out.println(f1.compose(f2).apply("JavaEightSession"));

    }
}
