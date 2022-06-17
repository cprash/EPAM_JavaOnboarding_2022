package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class ExtractData {
    private RequestSpecification requestSpecification=new RequestSpecBuilder().setBaseUri("https://www.zippopotam.us").setContentType(ContentType.JSON).build();
    private ResponseSpecification responseSpecification=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).expectResponseTime(lessThan(2000L)).build();
    @Test
    public void verifyStatusCode(){
        //https://www.zippopotam.us/us/90210
        Response response = given().spec(requestSpecification)
                .when().get("/us/90210")
                .then()
                .extract().response();
        int i = response.statusCode();
        String country = response.path("country");
        String state = response.path("places[0].state");
        System.out.println("Status code:"+i);
        System.out.println("Country:"+country);
        System.out.println("State:"+state);

    }
}
