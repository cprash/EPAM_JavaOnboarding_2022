package org.example;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class XmlTest {
    //https://petstore.swagger.io/v2/pet/12345
    @Test
    public void testXmlData(){
         given().
                 baseUri("https://petstore.swagger.io").
                 basePath("/v2").
         when().
                 get("/pet/12345").
         then().
                 assertThat().statusCode(200).
                 body("status",equalTo("available"));

    }
}
