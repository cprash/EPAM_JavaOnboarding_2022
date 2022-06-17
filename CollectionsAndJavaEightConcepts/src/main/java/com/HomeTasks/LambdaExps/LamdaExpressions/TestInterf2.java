package com.HomeTasks.LambdaExps.LamdaExpressions;

public class TestInterf2 {

    int x=777;

    public void m2() {
        int y=20;
        Interf i=()->{
            int z=30;
        System.out.println(y);
        System.out.println(this.x);
        System.out.println(z);
        z=40;
        System.out.println(z);
        };


        i.m2();
    }

    public static void main(String[] args){
        TestInterf2 t=new TestInterf2();
        t.m2();
    }
}
