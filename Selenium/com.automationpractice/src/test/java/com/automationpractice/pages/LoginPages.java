package com.automationpractice.pages;

import org.openqa.selenium.By;

public class LoginPages {


    By emailfield = By.cssSelector("#email");

    By passwordfield = By.cssSelector("#passwd");

    By submitlogin = By.cssSelector("#SubmitLogin");

    By validateuser = By.cssSelector(".header_user_info>a>span");

    By errormessage = By.cssSelector(".alert.alert-danger>ol>li");

    public By getEmailfield() {return emailfield;}

    public By getPasswordfield() {return passwordfield;}

    public By getSubmitlogin() {return submitlogin;}

    public By getValidateuser() {return validateuser;}

    public By getErrormessage() {return errormessage;}
}
