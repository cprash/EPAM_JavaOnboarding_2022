package com.FunctionalInterface.ConsumerAndSupplier;

import java.util.function.Supplier;

public class SupplierTest
{
    public static void main(String[] args)
    {
        String[] str={"Test1","Test2","Test3","Test4"};
        Supplier<String> supp = ()->{
            int i= (int) (Math.random()*4);
            return str[i];
        };

        System.out.println(supp.get());
        System.out.println(supp.get());
        System.out.println(supp.get());
    }
}
