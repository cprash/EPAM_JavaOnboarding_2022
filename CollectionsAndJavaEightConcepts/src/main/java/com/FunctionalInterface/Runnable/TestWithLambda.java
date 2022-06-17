package com.FunctionalInterface.Runnable;

public class TestWithLambda {

    public static void main(String[] args){
        Thread thread=new Thread(()-> {
                for(int i=0;i<2;i++)
                    System.out.println("Child Thread");

        });
        thread.start();

        for(int i=0;i<2;i++)
            System.out.println("Main thread");
    }
}
