package com.Pizza;

import com.Pizza.baseTypes.Soft;
import com.Pizza.baseTypes.Standard;
import com.Pizza.toppings.Corn;
import com.Pizza.toppings.Mushroom;
import com.Pizza.toppings.Tomato;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pizza {

    private String baseType;
    private HashSet<String> toppings;
    private float totalCost=0;

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public Set<String> getToppings() {
        return toppings;
    }

    public void setToppings(HashSet<String> toppings) {
        this.toppings = toppings;
    }

    public float calculatePizzaPrice()
    {
        switch(baseType){
            case "Standard Base":totalCost=totalCost+new Soft().getBaseCost();break;
            case "Soft Base":totalCost=totalCost+new Standard().getBaseCost();
        }

        Iterator itr=toppings.iterator();
        while(itr.hasNext())
        {
            switch(itr.next().toString()){
                case "Tomato":totalCost=totalCost+new Tomato().getToppingCost();break;
                case "Corn":totalCost=totalCost+new Corn().getToppingCost();break;
                case "Mushroom":totalCost=totalCost+new Mushroom().getToppingCost();
            }


        }
        return totalCost;
    }
}
