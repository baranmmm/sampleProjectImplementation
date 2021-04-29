package com.sample.pages;

import com.sample.utilities.Driver;

public class PageInitializer extends Driver {

    public static LoginPageElements loginPage;
    public static MainPageElements mainPage;
    public static ItemDetailsPageElements itemDetailsPage;
    public static CartPageElements cartPage;
    public static CustomerInfoPageElements customerInfoPage;
    public static CheckoutOverviewPageElements checkoutOverviewPage;


    public static void initialize() {

        loginPage = new LoginPageElements();
        mainPage = new MainPageElements();
        itemDetailsPage = new ItemDetailsPageElements();
        cartPage = new CartPageElements();
        customerInfoPage = new CustomerInfoPageElements();
        checkoutOverviewPage=new CheckoutOverviewPageElements();


    }
}
