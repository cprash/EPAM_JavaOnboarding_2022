package com.defaultmethods;

public interface Interf {

    public void add();

    default void m1()
    {System.out.println("Default Method");}

    default void m2()
    {System.out.println("Default Method");}
}
