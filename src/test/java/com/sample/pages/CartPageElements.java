package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageElements extends CommonPageElements {

    public CartPageElements() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

}
