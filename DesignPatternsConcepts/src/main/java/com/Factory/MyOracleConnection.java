package com.Factory;

public class MyOracleConnection implements Connection{
    @Override
    public void doSomeOperation() {
        System.out.println("Performing Db operation on My Oracle Connection");
    }
}
