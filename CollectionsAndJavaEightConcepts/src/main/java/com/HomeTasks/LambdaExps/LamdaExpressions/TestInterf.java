package com.HomeTasks.LambdaExps.LamdaExpressions;

public class TestInterf  {

    int x=777;

    public void m2() {
        Interf i=()->{int x=888;
        System.out.println(x);
        System.out.println(this.x);};
        //this.x=999;
        //System.out.println(this.x);

        i.m2();
    }

    public static void main(String[] args){
        TestInterf t=new TestInterf();
        t.m2();
    }
}
