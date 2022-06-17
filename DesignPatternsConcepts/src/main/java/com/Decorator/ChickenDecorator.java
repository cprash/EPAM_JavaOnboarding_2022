package com.Decorator;

public class ChickenDecorator extends SandwichDecorator{
    public ChickenDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make(){
        return customSandwich.make()+ addDressing();
    }

    private String addDressing(){
        return "and Roasted Sauce";
    }
}
