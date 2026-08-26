package tests;

import config.ApiConfig;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UsersApiTest {

    @BeforeClass
    public void setUp() {

        RestAssured.baseURI = ApiConfig.BASE_URL;
    }

    @Test
    public void getUserTest() {

        given()
            .pathParam("id", 1)

        .when()
            .get("/users/{id}")

        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("email", notNullValue());
    }

    @Test
    public void getUsersTest() {

        when()
            .get("/users")

        .then()
            .statusCode(200)
            .body("$", not(empty()));
    }

    @Test
    public void getNonExistingUserTest() {

        when()
            .get("/users/9999")

        .then()
            .statusCode(404);
    }
}
