package org.Hometasks;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.Model.Category;
import org.Model.Pet;
import org.Model.Users;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItems;

public class Task2JsonPlaceholder {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI="https://jsonplaceholder.typicode.com";
        RestAssured.requestSpecification=new RequestSpecBuilder().setContentType(ContentType.JSON).setAccept(ContentType.JSON).build();
    }
    @Test
    public void testGet(){
        Response getUsers = get("/users");
        int statusCode = getUsers.statusCode();
        Users[] as = getUsers.as(Users[].class);
        Assert.assertTrue(as.length>3);
        getUsers.then().assertThat().statusCode(200).body("name",hasItems("Ervin Howell"));
    }

    }
