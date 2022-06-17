package com.Builder;

public class BuilderRunner {
    public static void main(String[] args) {
        LunchMenu.Builder builder=new LunchMenu.Builder().starter("veg roll").mainCourse("roti").desert("ice cream");
        LunchMenu lunchMenu=builder.build();
    }
}
