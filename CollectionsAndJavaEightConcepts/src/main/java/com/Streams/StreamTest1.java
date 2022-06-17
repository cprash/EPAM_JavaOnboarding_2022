package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(2);
        arr.add(5);

        List<Integer> evenList = arr.stream().filter((num) -> num % 2 == 0).collect(Collectors.toList());

        System.out.println(evenList);
    }
}
