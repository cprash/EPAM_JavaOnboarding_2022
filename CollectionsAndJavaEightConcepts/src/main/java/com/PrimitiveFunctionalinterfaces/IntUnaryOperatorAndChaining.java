package com.PrimitiveFunctionalinterfaces;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorAndChaining {
    public static void main(String[] args){
        IntUnaryOperator iuo1=(i)->{return i+i;};
        IntUnaryOperator iuo2=(i)->{return i*i;};

        System.out.println(iuo1.andThen(iuo2).applyAsInt(10));
    }
}
