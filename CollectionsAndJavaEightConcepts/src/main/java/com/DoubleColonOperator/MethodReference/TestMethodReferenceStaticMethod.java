package com.DoubleColonOperator.MethodReference;

public class TestMethodReferenceStaticMethod {

    public static int addTwoNums(int a,int b){
        return a+b;
    };

    public static void main(String[] args){
        TestInterfaceAdd testInterfaceAdd=TestMethodReferenceStaticMethod::addTwoNums;
        System.out.println(testInterfaceAdd.add(10,20));
    }

}
