package com.automationpractice.enums;

import com.automationpractice.interfaces.WebAplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Web implements WebAplication {

    CHROME {
        @Override
        public WebDriver driver() {
            return new ChromeDriver();
        }
    }
    ;
}
