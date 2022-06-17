package com.HomeTasks.PremitiveInterfaces;

import java.util.function.IntPredicate;

public class Q1IntPredPrimeNumber {
    public static void main(String[] args){
        IntPredicate pred=(integer)->{
            int flag=0;
            for(int i=2;i<=integer/2;i++){
                if(integer%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                return false;
            else return true;
        };
        if(pred.test(23)==true)
            System.out.println("PRIME");
        else System.out.println("NOT PRIME");
    }
}
