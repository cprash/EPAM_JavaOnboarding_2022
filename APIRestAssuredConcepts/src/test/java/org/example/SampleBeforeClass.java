package org.example;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class SampleBeforeClass {

    @BeforeClass
    public void setup(){
        RestAssured.requestSpecification=new RequestSpecBuilder().setBaseUri("https://www.zippopotam.us").setContentType(ContentType.JSON).build();
        RestAssured.responseSpecification=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).expectResponseTime(lessThan(2000L)).build();
    }
    @Test
    public void verifyStatusCode(){
        //https://www.zippopotam.us/us/90210
        get("/us/90210");
    }
    @Test
    public void verifyBody(){
        //https://www.zippopotam.us/us/90210
        get("/us/90210")
                .then()
                .body("country",equalTo("United States"));
    }
    @Test
    public void verifyBody2(){
        //https://www.zippopotam.us/us/90210
        Response response = get("/us/90210");
        System.out.println(response.asString());
    }
    @Test
    public void verifyBody3(){
        //https://www.zippopotam.us/us/90210
       get("/us/90210").then().assertThat().body("places[0].state",equalTo("California")).body("places[0].'place name'",equalTo("Beverly Hills"));
    }

    @Test
    public void verifyContentType(){
        //https://www.zippopotam.us/us/90210
        get("/us/90210");
    }
}
