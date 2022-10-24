package com.automationpractice.funcs;

import com.automationpractice.common.BaseTest;
import com.automationpractice.pages.CadastroPages;
import org.openqa.selenium.support.ui.Select;

public class CadastroFuncs extends BaseTest {
    CadastroPages cadastroPages = new CadastroPages();

    public void createAccount(String email, String firstname, String lastname, String pass){
        //validate email
        driver.findElement(cadastroPages.getEmailField()).sendKeys(email);
        driver.findElement(cadastroPages.getSubmitButton()).click();

        //YOUR PERSONAL INFORMATION
        driver.findElement(cadastroPages.getGenderRadio()).click();
        driver.findElement(cadastroPages.getFirstNameField()).sendKeys(firstname);
        driver.findElement(cadastroPages.getLastNameField()).sendKeys(lastname);
        driver.findElement(cadastroPages.getPasswordField()).sendKeys(pass);

        Select days = new Select(driver.findElement(cadastroPages.getDaysSelect()));
        days.selectByValue("24");
        Select mounth = new Select(driver.findElement(cadastroPages.getMonthSelect()));
        mounth.selectByValue("3");
        Select years = new Select(driver.findElement(cadastroPages.getYearsSelect()));
        years.selectByValue("2000");

        driver.findElement(cadastroPages.getAdressField()).sendKeys("street test");
        driver.findElement(cadastroPages.getCityField()).sendKeys("Brooklyn");
        Select state = new Select(driver.findElement(cadastroPages.getStateSelect()));
        state.selectByValue("32");
        driver.findElement(cadastroPages.getPostalCodeField()).sendKeys("00000");
        Select country = new Select(driver.findElement(cadastroPages.getCountrySelect()));
        country.selectByValue("21");
        driver.findElement(cadastroPages.getPhoneField()).sendKeys("00000000000");
        driver.findElement(cadastroPages.getSubmitAccountButton()).click();
    }
    public String userEquals(){
        return driver.findElement(cadastroPages.getValidateUser()).getText();
        }

    public void invalidemail(String email){

        driver.findElement(cadastroPages.getEmailField()).sendKeys(email);
        driver.findElement(cadastroPages.getSubmitButton()).click();
    }
    public String emailerror(){return driver.findElement(cadastroPages.getInvalidemail()).getText();}

}
