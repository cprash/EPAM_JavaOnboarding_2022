package com.Duck;

public class IndianDuck extends Duck{
    public IndianDuck() {
        quackBehavior=new CanQuack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Indian Duck");
    }
}
