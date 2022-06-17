package com.SortingAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingCollectioions
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(10);
        arr.add(5);
        Collections.sort(arr);
        System.out.println(arr);
    }
}