package org.example;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

public class PetSchemaTests {
    @Test
    public void testJsonSchemaData(){
        given().
                baseUri("https://petstore.swagger.io").
                basePath("/v2").
                when().
                get("/pet/9223372036854070354").
                then().
                assertThat().statusCode(200)
                .body(matchesJsonSchemaInClasspath("PetSchema.json"));

    }
}

