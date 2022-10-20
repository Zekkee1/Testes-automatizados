package com.automationpractice.pages;

import org.openqa.selenium.By;

public class CheckoutPages {

    By clicklogo = By.cssSelector(".logo.img-responsive");

    By product1 = By.cssSelector("img[src='http://automationpractice.com/img/p/1/1-home_default.jpg']");

    By addbutton = By.cssSelector("a[data-id-product='1']");

    By buttontocart = By.cssSelector(".btn.btn-default.button.button-medium");

    By buttontoaddress = By.cssSelector("p>a[title='Proceed to checkout']");

    By buttontoshipping = By.cssSelector("button[name='processAddress']");

    By checkboxterms = By.cssSelector("#cgv");

    By buttontopayment = By.cssSelector("button[name='processCarrier']");

    By paybybankwire = By.cssSelector(".bankwire");

    By buttonconfirm = By.cssSelector("p > button");

    By validatepurchase = By.cssSelector("p>strong");



    public By getClicklogo() {return clicklogo;}

    public By getProduct1() {return product1;}

    public By getAddbutton() {return addbutton;}

    public By getButtontocart() {return buttontocart;}

    public By getButtontoaddress() {
        return buttontoaddress;
    }

    public By getButtontoshipping() {
        return buttontoshipping;
    }

    public By getCheckboxterms() {
        return checkboxterms;
    }

    public By getButtontopayment() {
        return buttontopayment;
    }

    public By getPaybybankwire() {
        return paybybankwire;
    }

    public By getButtonconfirm() {
        return buttonconfirm;
    }

    public By getValidatepurchase() {
        return validatepurchase;
    }




}
