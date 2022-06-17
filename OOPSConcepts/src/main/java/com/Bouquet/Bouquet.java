package com.Bouquet;


import com.Bouquet.Flowers.FlowerFactory;
import com.Bouquet.Flowers.Jasmine;
import com.Bouquet.Flowers.Lilly;
import com.Bouquet.Flowers.Rose;

import java.util.Map;


public class Bouquet {

    private Map<String ,Integer> bouquet;

    private float bouquetCost=0;

    public Bouquet(Map<String, Integer> bouquet) {
        this.bouquet = bouquet;
    }

    public Map<String, Integer> getBouquet() {
        return bouquet;
    }


    public float calculateBouquetPrice(Map<String, Integer> bq)
    {
        for(Map.Entry eS:bq.entrySet())
        {
            int flowerCount=Integer.parseInt(eS.getValue().toString());
            switch(eS.getKey().toString()) {
                case "Rose":bouquetCost=bouquetCost+(flowerCount* FlowerFactory.getFlower("Rose").getFlowerCost());break;
                case "Jasmine":bouquetCost=bouquetCost+(flowerCount*FlowerFactory.getFlower("Jasmine").getFlowerCost());break;
                case "Lilly":bouquetCost=bouquetCost+(flowerCount*FlowerFactory.getFlower("Lilly").getFlowerCost());
            }
        }
            return bouquetCost;
    }
}
