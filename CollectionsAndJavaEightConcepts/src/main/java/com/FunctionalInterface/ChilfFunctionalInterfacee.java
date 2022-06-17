package com.FunctionalInterface;

public interface ChilfFunctionalInterfacee extends TestInterface {
    public String getDetails();  //Over Wridden
    //public String getDetailsOne(); ---Compilation Error

    default void displayOne(){}
    default void displayTwo(){}

    static void displayThree(){}
    static void displayFour(){}
}
