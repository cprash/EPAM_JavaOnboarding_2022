package com.SingletonTest;

public class MySIngleton {
    private static MySIngleton mySIngleton=null;

    private MySIngleton(){
        if(mySIngleton!=null)
            throw new RuntimeException("Not correct way of calling me");
    }

    static MySIngleton getInstance(){
        if(mySIngleton==null)
           mySIngleton=  new MySIngleton();
        return mySIngleton;
    }
}
