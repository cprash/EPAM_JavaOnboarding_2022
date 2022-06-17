package com.Factory;

public class SecureMyOracleConnection implements Connection{
    @Override
    public void doSomeOperation() {
        System.out.println("Performing Db operation on Secure My Oracle Connection");
    }
}
