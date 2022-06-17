package com.PrimitiveFunctionalinterfaces;

import java.util.function.IntConsumer;

public class IntConsumerTest {
    public static void main(String[] args){
        IntConsumer incon=(i)->{
            System.out.println(i*i);
        };
        incon.accept(10);
    }
}
