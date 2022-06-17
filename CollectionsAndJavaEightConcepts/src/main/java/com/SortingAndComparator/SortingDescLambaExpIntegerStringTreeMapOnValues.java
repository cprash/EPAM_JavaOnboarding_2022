package com.SortingAndComparator;

import java.util.*;

public class SortingDescLambaExpIntegerStringTreeMapOnValues
{
    public static void main(String[] args) {
        Map<Integer,String> tm=new LinkedHashMap<>();
        tm.put(300,"Rahul");
        tm.put(200,"Jio");
        tm.put(100,"Pranav");
        tm.put(50,"Manoj");
        tm.put(250,"Nand");

        LinkedList<Map.Entry<Integer, String>> entries = new LinkedList<>(tm.entrySet());

        Collections.sort(entries,(set1,set2)->{
            if(set1.getValue().compareTo(set2.getValue())>1)
                return -1;
            else if(set1.getValue().compareTo(set2.getValue())<1)
                return +1;
            else return 0;
        });

        Map<Integer,String> newMap= new LinkedHashMap<>();
        for(Map.Entry<Integer,String> me: entries)
            newMap.put( me.getKey(), me.getValue());

        System.out.println("After Desc Sort on value:"+newMap);

    }
}