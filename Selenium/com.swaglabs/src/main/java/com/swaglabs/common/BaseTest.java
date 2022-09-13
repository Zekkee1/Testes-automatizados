package com.swaglabs.common;

import com.swaglabs.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;


    protected void  inicializarDriver(AplicacaoWeb aplicacaoWeb){
        driver = aplicacaoWeb.driver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
