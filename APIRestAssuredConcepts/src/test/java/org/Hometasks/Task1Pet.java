package org.Hometasks;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.Model.Category;
import org.Model.Pet;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Task1Pet {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="/v2";
        RestAssured.requestSpecification=new RequestSpecBuilder().setContentType(ContentType.JSON).setAccept(ContentType.JSON).build();
    }

    @Test
    void testTask1(){
        Category category=new Category(1,"dog");
        Pet pet=new Pet(12345,"snoopie",category,"pending");
        given().body(pet).when().post("/pet").then().assertThat().statusCode(200);

        Response response = get("/pet/12345");
        int statusCode=response.statusCode();
        String contentType = response.getContentType();
        Pet resultPet = response.as(Pet.class);
        Assert.assertEquals(statusCode,200);
        Assert.assertEquals(contentType,"application/json");
        Assert.assertEquals(resultPet.getName(),"snoopie");
        Assert.assertEquals(resultPet.getCategory().getName(),"dog");
        Assert.assertEquals(resultPet.getStatus(),"pending");

    }

}
