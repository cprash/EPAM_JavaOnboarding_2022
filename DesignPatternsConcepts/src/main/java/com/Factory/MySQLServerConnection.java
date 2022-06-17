package com.Factory;

public class MySQLServerConnection implements Connection {
    @Override
    public void doSomeOperation() {
        System.out.println("Performing Db operation on My Oracle Connection");
    }
}
