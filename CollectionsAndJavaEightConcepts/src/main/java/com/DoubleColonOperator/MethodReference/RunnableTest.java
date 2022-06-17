package com.DoubleColonOperator.MethodReference;

public class RunnableTest {

    public static void run(){
        for(int i=0;i<2;i++)
            System.out.println("Child Thread "+i);
    }

    public static void main(String[] args){
        Runnable runnable=RunnableTest::run;
        Thread thread=new Thread(runnable);
        thread.start();

        for(int i=0;i<2;i++)
            System.out.println("Main Thread "+i);

    }

}
