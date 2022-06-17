package org.example;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.Model.Category;
import org.Model.Pet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class AllMethodsOnPet {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="/v2";
        RestAssured.requestSpecification=new RequestSpecBuilder().setContentType(ContentType.JSON).setAccept(ContentType.JSON).build();
    }
    @Test
    public void testGet(){
        get("/pet/12345").then().statusCode(200);
    }
    @Test void testDelete(){
        delete("/pet/9223372036854018595").then().statusCode(200);
    }
    @Test
    void testPost(){
        Response post = given().body("{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}").when().post("/pet");
        String id=post.path("id").toString();
        System.out.println(id);
    }
    @Test
    void testPost1(){
        Category category=new Category(1,"dog");
        Pet pet=new Pet(12345,"snoopie",category,"pending");
        Response post = given().body(pet).when().post("/pet");
        String name=post.path("name");
        System.out.println(name);
    }
    @Test
    void testGet1(){
        Response response = get("/pet/12345");
        Pet pet = response.as(Pet.class);
        System.out.println(pet.getName());
    }
    @Test
    void testPut(){
        Category category=new Category(1,"dog");
        Pet pet=new Pet(12345,"snoopie",category,"available");
        Response post = given().body(pet).when().post("/pet");
        String status=post.path("status");
        System.out.println(status);
    }
    @Test
    void testAllMethods(){
        Map<String,Object> catMap=new HashMap<>();
        catMap.put("id",1);
        catMap.put("name","dog");
        Map<String,Object> petMap=new HashMap<>();
        petMap.put("name","doggie-epam");
        petMap.put("status","pending");
        petMap.put("category",catMap);

        String newPetid = given().body(petMap).when().post("/pet").path("id").toString();

        given().pathParam("newPetid",newPetid).when().get("/pet/{newPetid}").then().statusCode(200)
                .and().body("status",equalTo("pending"));

        petMap.put("status","available");
        petMap.put("id",newPetid);
        given().body(petMap).when().put("/pet").then().statusCode(200);

        given().pathParam("newPetid",newPetid).when().get("/pet/{newPetid}").then().statusCode(200)
                .and().body("status",equalTo("available"));

        given().pathParams("newPetid",newPetid).when().delete("/pet/{newPetid}").then().statusCode(200);

        given().pathParam("newPetid",newPetid).when().get("/pet/{newPetid}").then().statusCode(404);

    }

}
