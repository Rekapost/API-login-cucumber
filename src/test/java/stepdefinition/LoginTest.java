package stepdefinition;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;


public class LoginTest{
    private Response response; // We'll store the response for later validation

    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Sending a POST request to the login page
        response = given()
                .baseUri("http://localhost:3000/")
                .header("Content-type", "application/json")
                .body("{ \"uname\": \"reka12\", \"psw\": \"reka123\", \"remember\": \"on\" }")
            .when()
                .log().all()
                .post("/login")
            .then()
                .log().all()
                .statusCode(200)  // Assert that the status code is 200 OK
                .extract().response();  // Capture the response for later validation
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        // The logic for the valid username and password is already handled in the Given step.
        // This step can be left empty or can be extended if needed.
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Assert the response body contains the expected values
        String status = response.jsonPath().getString("status");
        String message = response.jsonPath().getString("message");
        
        // Ensure that status is "success" and message is "Login successful!"
        assertThat(status, equalTo("success"));
        assertThat(message, equalTo("Login successful!"));
        
        // Optionally, check if the data contains the expected values (e.g., uname, psw, remember)
        String uname = response.jsonPath().getString("data.uname");
        String psw = response.jsonPath().getString("data.psw");
        String remember = response.jsonPath().getString("data.remember");

        assertThat(uname, equalTo("reka12"));
        assertThat(psw, equalTo("reka123"));
        assertThat(remember, equalTo("on"));
    }
}

