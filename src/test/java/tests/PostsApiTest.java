package tests;

import config.ApiConfig;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostsApiTest {

    @BeforeClass
    public void setUp() {

        RestAssured.baseURI = ApiConfig.BASE_URL;
    }

    @Test
    public void getPostTest() {

        given()
            .pathParam("id", 1)

        .when()
            .get("/posts/{id}")

        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("title", notNullValue())
            .body("body", notNullValue());
    }

    @Test
    public void createPostTest() {

        String requestBody = """
                {
                    "title": "QA Automation",
                    "body": "REST Assured test",
                    "userId": 1
                }
                """;

        given()
            .contentType("application/json")
            .body(requestBody)

        .when()
            .post("/posts")

        .then()
            .statusCode(201)
            .body("title", equalTo("QA Automation"))
            .body("userId", equalTo(1));
    }

    @Test
    public void deletePostTest() {

        when()
            .delete("/posts/1")

        .then()
            .statusCode(200);
    }
}
