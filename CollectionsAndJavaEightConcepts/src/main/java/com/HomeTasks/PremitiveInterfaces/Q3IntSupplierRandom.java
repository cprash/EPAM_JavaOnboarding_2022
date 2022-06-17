package com.HomeTasks.PremitiveInterfaces;

import java.util.function.IntSupplier;

public class Q3IntSupplierRandom {
    public static void main(String[] args){
        IntSupplier intsup=()->{
            return (int) (Math.random()*5001);
        };

        System.out.println(intsup.getAsInt());

    }
}
