package com.automationpractice.pages;

import org.openqa.selenium.By;

public class CadastroPages {
    //validate email
    By emailField = By.cssSelector("#email_create");
    By submitButton = By.cssSelector("#SubmitCreate");

    //YOUR PERSONAL INFORMATION
    By genderRadio = By.cssSelector("#id_gender1");
    By firstNameField = By.cssSelector("#customer_firstname");
    By lastNameField = By.cssSelector("#customer_lastname");
    By passwordField = By.cssSelector("#passwd");
    By daysSelect = By.cssSelector("#days");
    By monthSelect = By.cssSelector("#months");
    By yearsSelect = By.cssSelector("#years");
    By adressField = By.cssSelector("#address1");
    By cityField = By.cssSelector("#city");
    By stateSelect = By.cssSelector("#id_state");
    By postalCodeField = By.cssSelector("#postcode");
    By countrySelect = By.cssSelector("#id_country");
    By phoneField = By.cssSelector("#phone_mobile");
    By submitAccountButton = By.cssSelector("#submitAccount");
    By validateUser = By.cssSelector(".header_user_info>a>span");
    By infoerros = By.cssSelector(".alert.alert-danger>p");

    By invalidemail = By.cssSelector(".alert.alert-danger>ol>li");

    public By getEmailField(){return emailField;}

    public By getSubmitButton() {return submitButton;}

    public By getGenderRadio() {return genderRadio;}

    public By getFirstNameField() {return firstNameField;}

    public By getLastNameField() {return lastNameField;}

    public By getPasswordField() {return passwordField;}

    public By getDaysSelect() {return daysSelect;}

    public By getMonthSelect() {return monthSelect;}

    public By getYearsSelect() {return yearsSelect;}

    public By getAdressField() {return adressField;}

    public By getCityField() {return cityField;}

    public By getStateSelect() {return stateSelect;}

    public By getPostalCodeField() {return postalCodeField;}

    public By getCountrySelect() {return countrySelect;}

    public By getPhoneField() {return phoneField;}

    public By getSubmitAccountButton() {return submitAccountButton;}

    public By getValidateUser() {return validateUser;}

    public By getInfoerros() {return infoerros;}

    public By getInvalidemail() {return invalidemail;}
}
