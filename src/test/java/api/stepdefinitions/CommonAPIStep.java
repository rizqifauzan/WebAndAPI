package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonAPIStep {

    @Given("I have the API endpoint {string}")
    public void i_have_the_api_endpoint(String endpoint) {
        // This step can be used to set up the API endpoint for the tests
        System.out.println("API Endpoint: " + endpoint);
    }

    @When("I send a GET request to the endpoint")
    public void i_send_a_get_request_to_the_endpoint() {
        // This step can be used to send a GET request to the API endpoint
        System.out.println("Sending GET request to the API endpoint");
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        // This step can be used to verify the response status code from the API
        System.out.println("Expected Status Code: " + statusCode);
    }

    @Then("the response body should contain {string}: {int}")
    public void the_response_body_should_contain(String key, Integer value) {
        // This step can be used to verify that the response body contains a specific key-value pair
        System.out.println("Expected Response Body: " + key + ": " + value);
    }
}
