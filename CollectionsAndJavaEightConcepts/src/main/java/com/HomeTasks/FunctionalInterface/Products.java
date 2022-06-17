package com.HomeTasks.FunctionalInterface;

public class Products {
    private String name;
    private float price;
    private String category;
    private String grade;

    public Products(String name, float price, String category, String grade){
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
