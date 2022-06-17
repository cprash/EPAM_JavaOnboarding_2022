package com.SortingAndComparator;

import java.util.TreeMap;

public class SortingDescLambaExpStringStringTreeMap
{
    public static void main(String[] args) {
        TreeMap<String,String> tm=new TreeMap<String,String>((String i1,String i2)->{
            if(i1.compareTo(i2)>1)
            return -1;
            else if(i1.compareTo(i2)<1)
            return +1;
            else return 0;
        });
        tm.put("b","Rahul");
        tm.put("a","Jio");
        tm.put("c","Pranav");
        tm.put("e","Manoj");
        tm.put("d","Nand");

        System.out.println("After Desc Sort:"+tm);
    }
}