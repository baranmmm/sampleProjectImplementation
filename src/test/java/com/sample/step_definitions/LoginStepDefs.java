package com.sample.step_definitions;

import com.sample.utilities.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs extends CommonSteps {

    @Given("user enters valid username")
    public void user_enters_valid_username() {
        sendText(loginPage.userName,"standard_user");
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        sendText(loginPage.password, "secret_sauce");
    }

    @When("click on login button")
    public void click_on_login_button() {
        click(loginPage.loginButton);
    }

    @Then("I validate that user is logged in")
    public void i_validate_that_user_is_logged_in() {
        Assert.assertTrue(loginPage.appLogo.isDisplayed());
    }

    @When("user leaves password empty")
    public void user_leaves_password_empty() {
        sendText(loginPage.userName,"");
    }

    @Then("I validate that {string} message is displayed")
    public void i_validate_that_message_is_displayed(String errorMessage) {
        Assert.assertEquals(loginPage.emptyError.getText(), errorMessage);
    }

    @When("user enters invalid username as {string}")
    public void user_enters_invalid_username_as(String username) {
        sendText(loginPage.userName,username);
    }

    @When("user enters invalid password as {string}")
    public void user_enters_invalid_password_as(String password) {
        sendText(loginPage.password,password);
    }

}
