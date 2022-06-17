package com.Factory;

public class SecureMySQLServerConnection implements Connection {
    @Override
    public void doSomeOperation() {
        System.out.println("Performing Db operation on Secure My Oracle Connection");
    }
}
