package com.HomeTasks.ConstructorReference;

public class Employeee {

    private String name;
    private String account;
    private float salary;

    public Employeee(String name, String account, float salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
        System.out.println("Executed Constructor :"+this.name+" "+this.account+" "+this.salary);
    }
}
