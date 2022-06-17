package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CheckStringisValidJSONorNot {

    public static boolean isValid(String checkStr){
        ObjectMapper newMap=new ObjectMapper();
        try{newMap.readTree(checkStr);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String jsoncheck="{{{}}}";
        System.out.println(isValid(jsoncheck));



    }
}
