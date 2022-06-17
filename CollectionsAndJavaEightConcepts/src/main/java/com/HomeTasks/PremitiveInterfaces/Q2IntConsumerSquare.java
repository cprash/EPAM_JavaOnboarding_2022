package com.HomeTasks.PremitiveInterfaces;

import java.util.function.IntConsumer;

public class Q2IntConsumerSquare {
    public static void main(String[] args){
        IntConsumer incon=(i)->{
            System.out.println(i*i);
        };
        incon.accept(10);
    }
}
