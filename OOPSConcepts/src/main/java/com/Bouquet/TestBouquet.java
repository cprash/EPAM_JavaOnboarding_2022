package com.Bouquet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestBouquet {

    public static  void main(String[] args)
    {
        Map<String,Integer> bouquet = new HashMap<String, Integer>();
        Scanner noOfRoses =new Scanner(System.in);
        Scanner noOfJasmines =new Scanner(System.in);
        Scanner noOfLillys =new Scanner(System.in);

        System.out.println("###Create Your Bouquet###");

        System.out.println("Enter Number of flowers you want:");
        System.out.println("1. Enter Number of Roses [Price :1$]");
        int numOfRoses= noOfRoses.nextInt();
        System.out.println("2. Enter Number of Jasmines [Price :2$]");
        int numOfJasmines= noOfJasmines.nextInt();
        System.out.println("3. Enter Number of Lillys [Price :3$]");
        int numOfLillys=noOfLillys.nextInt();

        bouquet.put("Rose",numOfRoses);
        bouquet.put("Jasmine",numOfJasmines);
        bouquet.put("Lilly",numOfLillys);

        Bouquet newBouquet= new Bouquet(bouquet);

        System.out.println("Your total Bill :" + newBouquet.calculateBouquetPrice(bouquet));

    }


}
