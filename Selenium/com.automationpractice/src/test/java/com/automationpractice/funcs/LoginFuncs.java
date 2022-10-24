package com.automationpractice.funcs;

import com.automationpractice.common.BaseTest;
import com.automationpractice.pages.LoginPages;

public class LoginFuncs extends BaseTest {

    LoginPages loginPages = new LoginPages();

    public void accLogin(String user, String password){

        driver.findElement(loginPages.getEmailfield()).sendKeys(user);
        driver.findElement(loginPages.getPasswordfield()).sendKeys(password);
        driver.findElement(loginPages.getSubmitlogin()).click();


    }

    public String userEquals(){
        return driver.findElement(loginPages.getValidateuser()).getText();
    }
    public String erromess(){
        return driver.findElement(loginPages.getErrormessage()).getText();
    }


}


