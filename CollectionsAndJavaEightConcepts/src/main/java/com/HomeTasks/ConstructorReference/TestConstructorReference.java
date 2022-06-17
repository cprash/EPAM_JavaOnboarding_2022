package com.HomeTasks.ConstructorReference;

public class TestConstructorReference {
    public static void main(String[] args){
        EmployeeeConsRef testInterfConsRef2= Employeee::new;
        testInterfConsRef2.get("Ron","Hotstar",2500);

    }
}
