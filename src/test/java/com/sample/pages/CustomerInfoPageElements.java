package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfoPageElements extends CommonPageElements {
    public CustomerInfoPageElements() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "first-name")
    public WebElement firstNameTextbox;

    @FindBy(id = "last-name")
    public WebElement lastNameTextbox;

    @FindBy(id = "postal-code")
    public WebElement zipCodeTextbox;

    @FindBy(id = "continue")
    public WebElement continueButton;


}
