package com.automationpractice.common;

import com.automationpractice.interfaces.WebAplication;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    protected void startDriver(WebAplication webAplication) {
        driver = webAplication.driver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
