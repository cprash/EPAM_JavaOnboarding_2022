package com.FunctionalInterface.predicates;

import java.util.function.Predicate;

public class AndJoin {

    public static void testCondition(Predicate<Integer> pred,int[] arr){
        for(int a:arr){
            if(pred.test(a))
                System.out.println(a);
        }
    }

    public static void main(String[] args){
        int[] a={1,2,15,12,25,22,24};
        Predicate<Integer> pred1=(i)->i>10;

        Predicate<Integer> pred2=(i)->i%2==0;

        testCondition(pred1.and(pred2),a);

    }
}
