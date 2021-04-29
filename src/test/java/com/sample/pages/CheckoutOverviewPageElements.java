package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPageElements extends CommonPageElements {

    public CheckoutOverviewPageElements() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
    public WebElement checkoutItem;

}
