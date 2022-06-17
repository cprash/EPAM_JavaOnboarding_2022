package com.HomeTasks.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Q6toQ10 {
    public static void testCondition(Predicate<Response> pred, ArrayList<Response> arr){
        for(Response p:arr){
            if(pred.test(p))
                System.out.println(p.getResBody());

        }
    }

    public static void main(String[] args){
        ArrayList<Response> arr=new ArrayList<Response>();
        arr.add(new Response("Response1",400,"JSON"));
        arr.add(new Response("Response2",400,"XML"));
        arr.add(new Response("Response3",200,"JSON"));
        arr.add(new Response("Response4",200,"XML"));

        Predicate<Response> pred1=(product)->product.getStatusCode()==400;
        Predicate<Response> pred2=(product)->product.getResType().equalsIgnoreCase("JSON");
        System.out.println("Response Bodies with Status Code 400 :");
        testCondition(pred1,arr);
        System.out.println("Response Bodies with Res Type as JSON :");
        testCondition(pred2,arr);
        System.out.println("Response Bodies with Res Code 400 and Res Type as JSON");
        testCondition(pred1.and(pred2),arr);
        System.out.println("Response Bodies with Res Code 400 OR Res Type as JSON");
        testCondition(pred1.or(pred2),arr);
        System.out.println("Response Bodies with Res Code is not 400 and Res Type as JSON");
        testCondition(pred1.negate().and(pred2),arr);

    }
}
