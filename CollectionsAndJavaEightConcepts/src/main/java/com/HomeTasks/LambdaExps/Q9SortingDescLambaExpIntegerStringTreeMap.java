package com.HomeTasks.LambdaExps;

import java.util.TreeMap;

public class Q9SortingDescLambaExpIntegerStringTreeMap
{
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>((Integer i1,Integer i2)->{
            if(i1<i2)
                return +1;
            else if(i1>i2)
                return -1;
            else return 0;

        });
        tm.put(300,"Rahul");
        tm.put(200,"Jio");
        tm.put(100,"Pranav");
        tm.put(50,"Manoj");
        tm.put(250,"Nand");

        System.out.println("After Desc Sort:"+tm);
    }
}