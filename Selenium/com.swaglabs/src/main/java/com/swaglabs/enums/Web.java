package com.swaglabs.enums;

import com.swaglabs.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Web implements AplicacaoWeb {

        CHROME {
            @Override
            public WebDriver driver() {
                return new ChromeDriver();
            }
        }
        ;
}
