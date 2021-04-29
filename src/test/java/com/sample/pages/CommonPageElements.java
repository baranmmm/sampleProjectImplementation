package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class CommonPageElements extends Driver {

    public CommonPageElements() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "app_logo")
    public WebElement appLogo;

    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    public WebElement goToCartButton;


}
