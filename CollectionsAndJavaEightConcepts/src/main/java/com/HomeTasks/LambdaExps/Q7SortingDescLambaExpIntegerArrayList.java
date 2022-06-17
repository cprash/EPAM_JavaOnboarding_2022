package com.HomeTasks.LambdaExps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Q7SortingDescLambaExpIntegerArrayList
{
    public static void main(String[] args) {
        TreeSet<Integer> arr = new TreeSet<Integer>((i1,i2)->{
            if(i1<i2)
                return +1;
            else if(i1>i2)
                return -1;
            else return 0;
        });
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(10);
        arr.add(5);

        System.out.println("After Desc Sort:"+arr);
    }
}