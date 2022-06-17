package com.Optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optionalS=Optional.empty();
        System.out.println(optionalS.isPresent());
        System.out.println(optionalS.isEmpty());
        //optionalS=Optional.of(null);
        optionalS=Optional.ofNullable(null);
        System.out.println(optionalS.isPresent());
        optionalS=Optional.ofNullable("xyz");
        System.out.println(optionalS.get());
    }
}
