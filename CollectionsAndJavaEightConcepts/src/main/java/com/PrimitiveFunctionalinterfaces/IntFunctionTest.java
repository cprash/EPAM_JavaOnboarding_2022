package com.PrimitiveFunctionalinterfaces;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;

public class IntFunctionTest {
    public static void main(String[] ars){
        IntFunction intfun=(i)->{
            return i*i;
        };
        DoubleFunction doubfunc=(i)->{
            return i*i;
        };

        System.out.println(intfun.apply(10));
        System.out.println(intfun.apply(10000));

    }
}
