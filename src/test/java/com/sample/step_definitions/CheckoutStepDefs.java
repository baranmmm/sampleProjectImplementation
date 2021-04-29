package com.sample.step_definitions;

import com.sample.utilities.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStepDefs extends CommonSteps {

    @Given("user is successfully logged in")
    public void user_is_successfully_logged_in() {

        sendText(loginPage.userName, "standard_user");
        sendText(loginPage.password,"secret_sauce");
        click(loginPage.loginButton);

    }

    @When("I click on item with name {string}")
    public void i_click_on_item_with_name(String itemName) {
        click(mainPage.getItem(itemName));
    }

    @When("I click on the ADD TO CART button")
    public void i_click_on_the_add_to_cart_button() {
        click(itemDetailsPage.addToCartButton);
    }

    @When("I click on the shopping cart button")
    public void i_click_on_the_shopping_cart_button() {
        click(itemDetailsPage.goToCartButton);
    }

    @When("I click on the checkout button")
    public void i_click_on_the_checkout_button() {
        click(cartPage.checkoutButton);
    }

    @When("I enter the order information as {string}, {string}, and {string}")
    public void i_enter_the_order_information_as_and(String firstName, String lastName, String zipCode) {
        sendText(customerInfoPage.firstNameTextbox, firstName);
        sendText(customerInfoPage.lastNameTextbox, lastName);
        sendText(customerInfoPage.zipCodeTextbox, zipCode);
    }

    @When("I click on continue button")
    public void i_click_on_continue_button() {
       click(customerInfoPage.continueButton);
    }

    @Then("I verify the item name matches that of {string}")
    public void i_verify_the_item_name_matches_that_of(String itemName) {
        String actualItemName = checkoutOverviewPage.checkoutItem.getText();
        Assert.assertEquals(itemName, actualItemName);
    }
}
