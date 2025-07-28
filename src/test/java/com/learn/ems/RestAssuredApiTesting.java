package com.learn.ems;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredApiTesting {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://api.api-ninjas.com/";
    }

    @Test
    public void test_400BadRequest() {
        given()
                .when()
                .param("name", "platinum")
                .get("v1/commodityprice")
                .then()
                .statusCode(400);
    }

    @Test
    public void test_Successful() {
        given()
                .when()
                .param("name", "platinum")
                .headers("X-Api-Key", "JcmVLwoaVGmUTM/qdwAWyw==fKBZqhqIyhUb3ufb")
                .get("v1/commodityprice")
                .then()
                .statusCode(200)
                .body("name", equalTo("Platinum"));
    }
}
