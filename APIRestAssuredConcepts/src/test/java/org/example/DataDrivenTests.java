package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class DataDrivenTests {
    private RequestSpecification requestSpecification=new RequestSpecBuilder().setBaseUri("https://www.zippopotam.us").setContentType(ContentType.JSON).build();
    private ResponseSpecification responseSpecification=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).expectResponseTime(lessThan(2000L)).build();

    @Test(dataProvider = "zipCodeData")
    public void verifyBody(String countryCode,String zipCode,String state){
        //https://www.zippopotam.us/us/90210
        given().pathParam("countryCode",countryCode)
                .pathParam("zipCode",zipCode)
                .spec(requestSpecification)
                .when().get("/{countryCode}/{zipCode}")
                .then()
                .spec(responseSpecification).body("places[0].state",equalTo(state));
    }

    @DataProvider(name="zipCodeData")
    public Object[][] getZipCodeData(){
        return new Object[][] {
                {"us","90210","California"},
                {"us","12345","New York"},
                {"de","24848","Schleswig-Holstein"},
                {"ca","Y1A","Yukon"}
        };
    }

}
