package com.automationpractice.funcs;

import com.automationpractice.common.BaseTest;
import com.automationpractice.pages.RegistroPages;
import org.openqa.selenium.support.ui.Select;

public class RegistroFuncs extends BaseTest {
    RegistroPages registroPages = new RegistroPages();

    public void createAccount(String email, String firstname, String lastname, String pass){
        //validate email
        driver.findElement(registroPages.getEmailField()).sendKeys(email);
        driver.findElement(registroPages.getSubmitButton()).click();

        //YOUR PERSONAL INFORMATION
        driver.findElement(registroPages.getGenderRadio()).click();
        driver.findElement(registroPages.getFirstNameField()).sendKeys(firstname);
        driver.findElement(registroPages.getLastNameField()).sendKeys(lastname);
        driver.findElement(registroPages.getPasswordField()).sendKeys(pass);

        Select days = new Select(driver.findElement(registroPages.getDaysSelect()));
        days.selectByValue("24");
        Select mounth = new Select(driver.findElement(registroPages.getMonthSelect()));
        mounth.selectByValue("3");
        Select years = new Select(driver.findElement(registroPages.getYearsSelect()));
        years.selectByValue("2000");

        driver.findElement(registroPages.getAdressField()).sendKeys("street test");
        driver.findElement(registroPages.getCityField()).sendKeys("Brooklyn");
        Select state = new Select(driver.findElement(registroPages.getStateSelect()));
        state.selectByValue("32");
        driver.findElement(registroPages.getPostalCodeField()).sendKeys("00000");
        Select country = new Select(driver.findElement(registroPages.getCountrySelect()));
        country.selectByValue("21");
        driver.findElement(registroPages.getPhoneField()).sendKeys("00000000000");
        driver.findElement(registroPages.getSubmitAccountButton()).click();
    }
    public String userEquals(){
        return driver.findElement(registroPages.getValidateUser()).getText();
        }

    public void invalidemail(String email){

        driver.findElement(registroPages.getEmailField()).sendKeys(email);
        driver.findElement(registroPages.getSubmitButton()).click();
    }
    public String emailerror(){return driver.findElement(registroPages.getInvalidemail()).getText();}

}
