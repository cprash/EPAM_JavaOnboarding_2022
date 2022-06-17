package com.HomeTasks.LambdaExps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Q3CheckRotationOfStrings
{
    public static void main(String[] args)
    {

        Function<List<String>,Boolean> function = (arr) -> {
            if(arr.get(0).toString().equalsIgnoreCase(String.valueOf(new StringBuilder(arr.get(1).toString()).reverse())))
            {return true;}
            else return false;
        };
        Scanner value=new Scanner(System.in);
        System.out.println("Enter String 1 :");
        String str1=value.next();
        System.out.println("Enter String 2 :");
        String str2=value.next();
        ArrayList<String> newList=new ArrayList<String>();
        newList.add(str1);
        newList.add(str2);

        if(function.apply(newList))
            System.out.print("Strings are exact opposite");
        else System.out.println("Strings are not exact opposite");
    }

}

