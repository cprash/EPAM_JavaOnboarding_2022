package com.Bouquet.Flowers;

public class FlowerFactory {
    private String flower;

    public FlowerFactory(String flower) {
        this.flower = flower;
    }

    public static Flower getFlower(String flowerType){
        Flower flower=null;
        if(flowerType.equalsIgnoreCase("Rose"))
            flower=new Rose();
        else if (flowerType.equalsIgnoreCase("Jasmine")) {
            flower=new Jasmine();
        } else if (flowerType.equalsIgnoreCase("Lilly")) {
            flower=new Lilly();
        }

        return flower;
    }
}
