package org.example;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FootballAPITests {

    //http://api.football-data.org/v4/teams
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://api.football-data.org";
        RestAssured.basePath = "/v4";
        RestAssured.requestSpecification = new RequestSpecBuilder().setContentType(ContentType.JSON)
                .addHeader("X-Auth-Token", "bb7aa6aab9ac44e3a3fc911f929aa94a")
                .build();
    }

    @Test
    public void test1() {
        get("/teams")
                .then().assertThat().statusCode(200);
    }

    @Test
    public void test2() {
        get("/teams/66")
                .then().assertThat().statusCode(200)
                .body("name", equalTo("Manchester United FC"));
    }

    @Test
    public void testDataComplex() {
        Response response = get("/teams");
        List<Map<String, ?>> teamsData = response.path("teams");
        //fetch a specific team based on name
        Map<String,?> teamObj= response.path("teams.find { it.name == 'Arsenal FC'}");

    }
    @Test
    public void testDataComplex1() {
        Response response = get("/teams/66");
        List<Map<String, ?>> teamsData = response.path("teams");
        //fetch a specific team member based on shirtnumber
        String name = response.path("squad.find { it.shirtNumber == 20}.name").toString();

        //fetch a  team members based on shirtnumber>20
        String name1 = response.path("squad.findAll { it.shirtNumber > 20}.name").toString();

        //fetch a  team members based on Maximum shirtnumber
        String name2 = response.path("squad.max { it.shirtNumber > 20}.name").toString();

        //fetch a  team members based on Minimum shirtnumber
        String name3 = response.path("squad.min { it.shirtNumber > 20}.name").toString();

        //Fetch Player who is goalkeeper and from England
        String name4 = response.path("squad.findAll { it.position == 'Goalkeeper'}.find { it.nationality=='England'}.name").toString();
        System.out.println();
    }
}
