package com.defaultmethods;

public class TestInterf {


    public static void main(String[] args){
        Interf i=()->System.out.println(10+20);
        i.add();
        i.m1();
        i.m2();
    }
}
