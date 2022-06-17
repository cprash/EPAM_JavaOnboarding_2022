package com.HomeTasks.ConsumerAndSupplier;

public class Productsss {
    private String name;
    private float price;
    private String category;
    private String grade;

    public Productsss(String name, float price){
        this.name=name;
        this.price=price;
        System.out.println("New Product Created "+this.name+" with price "+this.price);

    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Productsss(String name, float price, String category, String grade){
        this.name=name;
        this.price=price;
        this.category=category;
        this.grade=grade;
    }

    public String getName(){return this.name;}
    public float getPrice(){return this.price;}
    public String getCategory(){return this.category;}
    public String getGrade(){return this.grade;}
}
