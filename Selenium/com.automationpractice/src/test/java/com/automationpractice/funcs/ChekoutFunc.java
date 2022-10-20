package com.automationpractice.funcs;

import com.automationpractice.common.BaseTest;
import com.automationpractice.pages.CheckoutPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ChekoutFunc extends BaseTest {

    CheckoutPages checkoutPages = new CheckoutPages();

    public void accCheckout(){
        driver.findElement(checkoutPages.getClicklogo()).click();
        WebElement moveto = driver.findElement(checkoutPages.getProduct1());
        new Actions(driver).moveToElement(moveto).perform();
        driver.findElement(checkoutPages.getAddbutton()).click();
        driver.findElement(checkoutPages.getButtontocart()).click();

        driver.findElement(checkoutPages.getButtontoaddress()).click();
        driver.findElement(checkoutPages.getButtontoshipping()).click();
        driver.findElement(checkoutPages.getCheckboxterms()).click();
        driver.findElement(checkoutPages.getButtontopayment()).click();
        driver.findElement(checkoutPages.getPaybybankwire()).click();
        driver.findElement(checkoutPages.getButtonconfirm()).click();


    }
    public String validatePurchase() {
        return driver.findElement(checkoutPages.getValidatepurchase()).getText();}

}
