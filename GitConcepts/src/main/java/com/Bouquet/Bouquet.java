package com.Bouquet;


import com.Bouquet.Flowers.Jasmine;
import com.Bouquet.Flowers.Lilly;
import com.Bouquet.Flowers.Rose;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


public class Bouquet {

    private Map<String ,Integer> bouquet;

    private float bouquetCost=0;

    public Map<String, Integer> getBouquet() {
        return bouquet;
    }

    public Bouquet(Map<String, Integer> bouquet) {
        this.bouquet = bouquet;
    }

    public void setBouquet(Map<String, Integer> bouquet) {
        this.bouquet = bouquet;
    }

    public float calculateBouquetPrice(Map<String, Integer> bq)
    {
        for(Map.Entry eS:bq.entrySet())
        {
            switch(eS.getKey().toString()) {
                case "Rose":bouquetCost=bouquetCost+(Integer.parseInt(eS.getValue().toString())*new Rose().getFlowerCost());break;
                case "Jasmine":bouquetCost=bouquetCost+(Integer.parseInt(eS.getValue().toString())*new Jasmine().getFlowerCost());break;
                case "Lilly":bouquetCost=bouquetCost+(Integer.parseInt(eS.getValue().toString())*new Lilly().getFlowerCost());
            }
        }
        return bouquetCost;
    }
}
