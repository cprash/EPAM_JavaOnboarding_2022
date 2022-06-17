package org.example;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Outh2Test {

    @Test
    public void coopTest(){
        Response post = given()
                .auth()
                        .oauth2("dc957d5dbd4fafd27e45ac12f25f4917fd849e2f")
                                .when().
                post("http://coop.apps.symfonycasts.com/api/3317/chickens-feed");
        System.out.println(post.getBody().prettyPrint());
    }

    @Test
    public void coopTestDynamicBearer(){

        Response token = given()
                .formParam("client_id", "Apptest")
                .formParam("client_secret", "c52c901e47e5638017df8a593882bb74")
                .formParam("grant_type", "client_credentials")
                .post("http://coop.apps.symfonycasts.com/token");
        String access_token = token.path("access_token");
        //System.out.println("Bearer TOken :"+access_token);

        Response post = given()
                .auth()
                .oauth2(access_token)
                .when().
                post("http://coop.apps.symfonycasts.com/api/3317/chickens-feed");
        System.out.println(post.getBody().prettyPrint());
    }
}
