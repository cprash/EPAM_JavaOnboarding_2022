package com.DoubleColonOperator.MethodReference;

public class TestMethodReferenceInstanceMethod {

    public int addTwoNums(int a,int b){
        return a+b;
    };

    public static void main(String[] args){
        TestInterfaceAdd testInterfaceAdd= new TestMethodReferenceInstanceMethod()::addTwoNums;
        System.out.println(testInterfaceAdd.add(10,20));
    }

}
