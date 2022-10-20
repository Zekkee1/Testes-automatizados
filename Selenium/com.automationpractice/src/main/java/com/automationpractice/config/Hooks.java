package com.automationpractice.config;

import com.automationpractice.common.BaseTest;
import com.automationpractice.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hooks extends BaseTest {

    @Before
    public void before(){
        super.startDriver(Web.CHROME);
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector(".login")).click();
    }


    @After
    public void after(){
        //driver.quit();
    }


}
