package com.PrimitiveFunctionalinterfaces;

import java.util.function.IntSupplier;

public class IntSupplierTest {
    public static void main(String[] args){
        IntSupplier intsup=()->{
            return Integer.parseInt("10");
        };

        System.out.println(intsup.getAsInt());

    }
}
