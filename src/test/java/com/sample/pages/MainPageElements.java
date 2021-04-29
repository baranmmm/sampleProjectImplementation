package com.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageElements extends CommonPageElements {

    public MainPageElements() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[.=\"Sauce Labs Backpack\"]")
    public WebElement backPackLink;

    public WebElement getItem(String itemName){
       return driver.findElement(By.xpath("//div[.='"+itemName+"']"));
    }


}
