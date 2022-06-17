package com.PrimitiveFunctionalinterfaces;

import java.util.function.IntPredicate;

public class IntPredicateTest {
    public static void main(String[] args){
        int[] arr={1,4,5,6};
        IntPredicate intpred=(i)->{
            return i%2==0;
        };
        for(int i:arr) {
            if(intpred.test(i))
            System.out.println(i);
        }
    }
}
