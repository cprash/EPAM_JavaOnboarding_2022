package com.Decorator;

import java.lang.invoke.SwitchPoint;

public class SandwichDecorator implements Sandwich{
    Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich){
        this.customSandwich=customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
