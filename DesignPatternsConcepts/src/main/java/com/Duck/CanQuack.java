package com.Duck;

public class CanQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Can QUack");
    }
}
