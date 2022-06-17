package org.example;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Sample {
    @Test
    public void verifyStatusCode(){
        //https://www.zippopotam.us/us/90210
        given().baseUri("https://www.zippopotam.us")
                        .when().get("/us/90210")
                                        .then()
                                                .assertThat().statusCode(200);

    }
    @Test
    public void verifyBody(){
        //https://www.zippopotam.us/us/90210
        given().baseUri("https://www.zippopotam.us")
                .when().get("/us/90210")
                .then()
                .assertThat().statusCode(200).body("country",equalTo("United States"));

    }
    @Test
    public void verifyBody2(){
        //https://www.zippopotam.us/us/90210
        Response response = given().baseUri("https://www.zippopotam.us")
                .when().get("/us/90210");
        System.out.println(response.asString());

    }
    @Test
    public void verifyBody3(){
        //https://www.zippopotam.us/us/90210
       given().baseUri("https://www.zippopotam.us")
                .when().get("/us/90210").then().assertThat().body("places[0].state",equalTo("California")).body("places[0].'place name'",equalTo("Beverly Hills"));


    }

    @Test
    public void verifyContentType(){
        //https://www.zippopotam.us/us/90210
        given().baseUri("https://www.zippopotam.us")
                .when().get("/us/90210").then().assertThat().statusCode(200).contentType("application/json");


    }
}
