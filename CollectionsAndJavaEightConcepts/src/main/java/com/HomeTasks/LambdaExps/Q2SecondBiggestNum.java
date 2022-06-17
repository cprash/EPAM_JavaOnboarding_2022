package com.HomeTasks.LambdaExps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;

public class Q2SecondBiggestNum {
    public static void main(String[] args){

        ArrayList<Integer> arr1=new ArrayList<Integer>();
        System.out.println("Enter size of list : ");
        int size=new Scanner(System.in).nextInt();
        System.out.println("Enter "+size+" numbers : ");
        for (int i=0;i<size;i++)
        {
            arr1.add(new Scanner(System.in).nextInt());
        }
        Function<ArrayList<Integer>,Integer> function=(arr)->{
            Collections.sort(arr);
            return arr.get(arr.size()-2);
        };

        System.out.println("Second Largest Num in List : "+function.apply(arr1));



    }
}
