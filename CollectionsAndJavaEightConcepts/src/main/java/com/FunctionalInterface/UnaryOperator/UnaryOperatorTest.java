package com.FunctionalInterface.UnaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        Function<Integer,Integer> func=(i)->{return i*i;};
        UnaryOperator<Integer> uo=(i)->{return i*i;};

        System.out.println(func.apply(10));
        System.out.println(uo.apply(10));

}
}

