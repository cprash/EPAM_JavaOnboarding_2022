package com.SortingAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDescLambaExpIntegerArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(10);
        arr.add(5);

        System.out.println("Before Sort:"+arr);

        Collections.sort(arr,(Integer i1,Integer i2)->{
            if(i1<i2)
                return +1;
            else if(i1>i2)
                return -1;
            else return 0;

        });
        System.out.println("After Desc Sort:"+arr);
    }
}