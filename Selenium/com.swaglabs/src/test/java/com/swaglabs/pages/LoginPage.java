package com.swaglabs.pages;

import org.openqa.selenium.By;

public class LoginPage {

    By campoUser= By.id("user-name");
    By campoPassword= By.id("password");
    By botaoLogin=By.id("login-button");
    By loginTitle=By.cssSelector(".title");

    public By getCampoUser(){return campoUser;}

    public By getCampoPassword(){ return campoPassword;}

    public By getBotaoLogin(){return botaoLogin;}

    public By getLoginTitle(){return loginTitle;}
}
