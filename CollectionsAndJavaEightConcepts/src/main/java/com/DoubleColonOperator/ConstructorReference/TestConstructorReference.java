package com.DoubleColonOperator.ConstructorReference;

public class TestConstructorReference {
    public static void main(String[] args){

        TestInterfConsRef testInterfConsRef1=(str)->{
            return new Sample(str);
        };
        testInterfConsRef1.get("Test1");
        TestInterfConsRef testInterfConsRef2=Sample::new;
        testInterfConsRef2.get("Test2");

    }
}
