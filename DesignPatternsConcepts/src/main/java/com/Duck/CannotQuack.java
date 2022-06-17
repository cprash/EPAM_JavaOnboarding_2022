package com.Duck;

public class CannotQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }
}
