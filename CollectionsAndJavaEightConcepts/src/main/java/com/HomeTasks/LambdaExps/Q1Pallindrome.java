package com.HomeTasks.LambdaExps;

import java.util.Scanner;
import java.util.function.Function;

public class Q1Pallindrome
{
    public static void main(String[] args)
    {
        Function<Integer, Boolean> function = (Integer i) -> {
            int revOfnum=0;
            int num=i.intValue();
            while(i>0)
            {
                revOfnum=revOfnum*10+(i.intValue()%10);
                i=i/10;
            }
            System.out.println(num+"  "+revOfnum);
            if(num==revOfnum)
                return true;
            else return false;
        };
        Scanner value=new Scanner(System.in);
        System.out.println("Enter Number to be checked:");
        int a=value.nextInt();
        if(function.apply(a))
            System.out.print("Pallindrome !!!");
        else System.out.println("Not a Pallindrome");
    }

}

