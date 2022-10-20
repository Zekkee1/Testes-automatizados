package com.automationpractice.funcs;

import com.automationpractice.common.BaseTest;
import com.automationpractice.pages.RegisterPages;
import org.openqa.selenium.support.ui.Select;

public class RegisterFunc extends BaseTest {
    RegisterPages registerPages = new RegisterPages();

    public void createAccount(String email, String firstname, String lastname, String pass){
        //validate email
        driver.findElement(registerPages.getEmailField()).sendKeys(email);
        driver.findElement(registerPages.getSubmitButton()).click();

        //YOUR PERSONAL INFORMATION
        driver.findElement(registerPages.getGenderRadio()).click();
        driver.findElement(registerPages.getFirstNameField()).sendKeys(firstname);
        driver.findElement(registerPages.getLastNameField()).sendKeys(lastname);
        driver.findElement(registerPages.getPasswordField()).sendKeys(pass);

        Select days = new Select(driver.findElement(registerPages.getDaysSelect()));
        days.selectByValue("24");
        Select mounth = new Select(driver.findElement(registerPages.getMonthSelect()));
        mounth.selectByValue("3");
        Select years = new Select(driver.findElement(registerPages.getYearsSelect()));
        years.selectByValue("2000");

        driver.findElement(registerPages.getAdressField()).sendKeys("street test");
        driver.findElement(registerPages.getCityField()).sendKeys("Brooklyn");
        Select state = new Select(driver.findElement(registerPages.getStateSelect()));
        state.selectByValue("32");
        driver.findElement(registerPages.getPostalCodeField()).sendKeys("00000");
        Select country = new Select(driver.findElement(registerPages.getCountrySelect()));
        country.selectByValue("21");
        driver.findElement(registerPages.getPhoneField()).sendKeys("00000000000");
        driver.findElement(registerPages.getSubmitAccountButton()).click();
    }
        public String userEquals(){
        return driver.findElement(registerPages.getValidateUser()).getText();
        }

    public void invalidemail(String email){

        driver.findElement(registerPages.getEmailField()).sendKeys(email);
        driver.findElement(registerPages.getSubmitButton()).click();
    }
    public String emailerror(){return driver.findElement(registerPages.getInvalidemail()).getText();}

}
