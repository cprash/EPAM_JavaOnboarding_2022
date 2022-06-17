package com.Factory;

public class FactoryRunner {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory=new ConnectionFactory("oracle");
        connectionFactory.createConnection().doSomeOperation();
        ConnectionFactory connectionFactory1=new ConnectionFactory("oracle");
        connectionFactory1.createConnection().doSomeOperation();
    }
}
