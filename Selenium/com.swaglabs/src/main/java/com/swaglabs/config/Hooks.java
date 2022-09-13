package com.swaglabs.config;

import com.swaglabs.common.BaseTest;
import com.swaglabs.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.swaglabs.common.BaseTest.driver;

public class Hooks extends BaseTest {
    @Before
    public void before() {
        super.inicializarDriver(Web.CHROME);

    }

    @After
    public void after(){
        //driver.quit();

    }
}
