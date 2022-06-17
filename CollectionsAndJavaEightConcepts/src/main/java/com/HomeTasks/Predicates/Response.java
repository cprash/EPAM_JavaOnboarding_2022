package com.HomeTasks.Predicates;

public class Response {
    private String resBody;
    private int statusCode;
    private String resType;

    public Response(String resBody,int statusCode,String resType){
        this.resBody=resBody;
        this.statusCode=statusCode;
        this.resType=resType;
    }

    public String getResBody(){return this.resBody;}
    public int getStatusCode(){return this.statusCode;}
    public String getResType(){return this.resType;}



}
