package web.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonWebStep {
    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        // This step can be used to navigate to a specific URL in the web application
        System.out.println("Navigating to URL: " + url);
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String linkText) {
        // This step can be used to click on a specific link in the web application
        System.out.println("Clicking on the link: " + linkText);
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        // This step can be used to verify the page title of the web application
        System.out.println("Expected Page Title: " + expectedTitle);
    }

}
