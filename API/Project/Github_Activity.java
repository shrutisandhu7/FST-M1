import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Github_Activity {
    RequestSpecification requestSpec;
    // Declare response specification
    ResponseSpecification responseSpec;
    String SSH_key;
    int id;
    @BeforeClass
    public void RequestSpecBuilder(){
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token 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")
                // Set base URL
                .setBaseUri("https://api.github.com")
                // Build request specification
                .build();
    }

    @Test(priority=1)
    // Test case using a DataProvider
    public void addPets() {
        String reqBody = "{\"title\": \"TestAPIKey\", \"key\": \"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIFmzOjq/W+SSN9/IQ7yaOfZKMHE6Rr8R1oftnStXU4wH\"}";
        Response response = given().spec(requestSpec) // Use requestSpec
                .body(reqBody) // Send request body
                .when().post("/user/keys"); // Send POST request

        System.out.println(response);
        System.out.println(response.getStatusCode());
        id = response.then().extract().path("id");
        // Assertions
        response.then().statusCode(201);
    }

    @Test(priority = 2)
    // Test case using a DataProvider
    public void getKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .when().get("/user/keys"); // Send GET Request

        System.out.println(response.headers());
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());

        // Assertions
        response.then().statusCode(200);
    }

    @Test(priority = 3)
    // Test case using a DataProvider
    public void deleteKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("keyId", id).when().delete("/user/keys/{keyId}"); // Send GET Request

        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());

        // Assertions
        response.then().statusCode(204);

    }


}

