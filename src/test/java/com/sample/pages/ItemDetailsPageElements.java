package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetailsPageElements extends CommonPageElements {
    public ItemDetailsPageElements() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[.=\"Add to cart\"]")
    public WebElement addToCartButton;

}
