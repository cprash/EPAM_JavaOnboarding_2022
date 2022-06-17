package com.SingletonTest;

public class SingletonRunner {
    public static void main(String[] args) {
        MySIngleton mySIngleton1=MySIngleton.getInstance();
        System.out.println(mySIngleton1);

        MySIngleton mySIngleton2=MySIngleton.getInstance();
        System.out.println(mySIngleton2);
    }
}
