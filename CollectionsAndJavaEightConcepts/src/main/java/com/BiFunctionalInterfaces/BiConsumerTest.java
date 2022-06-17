package com.BiFunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args){
        BiConsumer<String,String> bicon=(str1,str2)->{
            System.out.println(str1.concat(str2));
        };
        
        bicon.accept("Test1","Test2");

    }
}
