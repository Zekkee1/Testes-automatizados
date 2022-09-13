package com.swaglabs.funcs;

import com.swaglabs.common.BaseTest;
import com.swaglabs.pages.LoginPage;
import org.openqa.selenium.By;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();




    public void entrarTelaHome(){
        driver.get("https://www.saucedemo.com");
    }

    public void  realizarLogin(String usuario, String senha){
        driver.findElement(loginPage.getCampoUser()).sendKeys(usuario);
        driver.findElement(loginPage.getCampoPassword()).sendKeys(senha);
        driver.findElement(loginPage.getBotaoLogin()).click();
    }
    public String validarLogin(){
         return driver.findElement(loginPage.getLoginTitle()).getText();

        }

}

