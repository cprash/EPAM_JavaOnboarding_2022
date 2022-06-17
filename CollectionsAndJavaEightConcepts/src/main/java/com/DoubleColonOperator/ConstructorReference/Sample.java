package com.DoubleColonOperator.ConstructorReference;

public class Sample {

    private String str;

    public Sample(String str) {
        this.str = str;
        System.out.println("Constructor executed "+str);
    }

    public int addTwoNumbers(int a,int b)
    {
        return a+b;
    }
}
