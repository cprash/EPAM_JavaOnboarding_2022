package com.SortingAndComparator.CustomCLassSortingLambdaExpAndCOmparator;

public class Employee {
     int no;
     String name;

    public Employee(int no, String name){
        this.no=no;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Employee [Num="+no+",Name="+name+"] ";
    }

}
