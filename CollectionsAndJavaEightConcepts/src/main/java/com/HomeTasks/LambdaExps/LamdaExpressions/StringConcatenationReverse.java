package com.HomeTasks.LambdaExps.LamdaExpressions;

import java.util.function.Function;

public class StringConcatenationReverse {

    public static void main(String args[]){
        Function<String,String> function = (String a)->(a+a);
        Function<String,String> function1= (String a)-> String.valueOf(new StringBuilder(a).reverse());
        System.out.println(function.apply("Rahul"));
        System.out.println(function1.apply("Rahul"));
    }
}
