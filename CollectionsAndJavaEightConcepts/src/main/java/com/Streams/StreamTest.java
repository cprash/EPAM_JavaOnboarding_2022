package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Test");
        arr.add("Test1");

        Stream<String> stringStream = arr.stream().filter((str) -> str.length() > 4);
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);
    }
}
