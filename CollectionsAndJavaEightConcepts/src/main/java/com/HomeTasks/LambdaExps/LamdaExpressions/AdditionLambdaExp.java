package com.HomeTasks.LambdaExps.LamdaExpressions;

import java.util.function.Function;

public class AdditionLambdaExp {

    public static void main(String args[]){
        Function<Integer,Integer> function = (Integer a)->a+a;
        System.out.println(function.apply(20));
    }
}
