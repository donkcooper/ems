package com.learn.ems;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ProductApiTest {

    @BeforeClass
    public void setup() {
        System.out.println("Initalizing");
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/"; // your local/test server
    }

    @Test
    public void test1_success() {
      // data build/mocking
      String expectedValue = "HELLO";

      // operation
        String str1 = "Hello";
        String actual = str1.toUpperCase();

        // assertions
        Assertions.assertEquals("HELLO", actual);
    }

    @Test
    public void test1_failure() {
        // data build/mocking
        String expectedValue = "HELLO";

        // operation
        String str1 = "Hello";
        String actual = str1.toLowerCase();

        // assertions
        Assertions.assertNotEquals("HELLO", actual);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void test_NPE() {
        // data build/mocking
         String expectedValue = null;

        // operation
       expectedValue.toUpperCase();

    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void test_ArrayIndexOutOfBoundsException() {
        int a[] = new int[2];
        a[4] = 5;
    }

//    @Test
//    public void testAddProduct() {
//        String requestBody = """
//            {
//              "id": 1,
//              "name": "23' Straight ropes",
//              "price": 99.99
//            }
//        """;
//
//        given()
//                .contentType(ContentType.JSON)
//                .body(requestBody)
//                .when()
//                .post("/products")
//                .then()
//                .statusCode(201)
//                .body("name", equalTo("23' Straight ropes"))
//                .body("price", equalTo(99.99f));
//    }

    @Test
    public void testGetProductById() {
        given()
                .when()
                .get("/todos/1")
                .then()
                .statusCode(200);
    }

//    @Test
//    public void testDeleteProduct() {
//        given()
//                .pathParam("id", 1)
//                .when()
//                .delete("/products/{id}")
//                .then()
//                .statusCode(200); // or 204 depending on your API
//    }
//
//    @Test
//    public void testGetNonExistentProduct() {
//        given()
//                .pathParam("id", 999)
//                .when()
//                .get("/products/{id}")
//                .then()
//                .statusCode(404);
//    }

}
