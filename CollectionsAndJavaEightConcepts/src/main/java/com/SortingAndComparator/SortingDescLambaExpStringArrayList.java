package com.SortingAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDescLambaExpStringArrayList
{
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Rahul");
        arr.add("Jio");
        arr.add("Pranav");
        arr.add("Manoj");
        arr.add("Nand");

        System.out.println("Before Sort:"+arr);

        Collections.sort(arr,(String i1,String i2)->{
            if(i1.compareTo(i2)>1)
                return -1;
            else if(i1.compareTo(i2)<1)
                return +1;
            else return 0;

        });
        System.out.println("After Desc Sort:"+arr);
    }
}