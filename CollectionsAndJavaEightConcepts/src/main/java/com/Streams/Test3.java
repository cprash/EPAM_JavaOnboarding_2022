package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("xyz");
        arrayList.add("xyz");
        arrayList.add("abc");
        arrayList.add("abc");

        arrayList.stream().forEach((element)->System.out.println(element));
        arrayList.stream().forEach(System.out::println);

        List<String> collect = arrayList.stream().map((name) -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
