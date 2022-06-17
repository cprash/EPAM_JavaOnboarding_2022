package com.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(2);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(10);
        arr.add(22);
        arr.add(52);
        Comparator<Integer> comparator=(num1,num2)->{
            if(num1>num2)
                return -1;
            else if (num1<num2) {
                return +1;
            }
            else return 0;
        };
        arr.stream().sorted(comparator).forEach((num)-> System.out.println(num));

    }
}
