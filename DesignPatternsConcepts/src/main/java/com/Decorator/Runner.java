package com.Decorator;

public class Runner {
    public static void main(String[] args) {
        Sandwich sandwich=new DressingDecorator(new ChickenDecorator(new PlainSandwich()));

        System.out.println(sandwich.make());
    }
}
