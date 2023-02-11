package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By RegisterText = By.xpath("//a[@class='ico-register']");
    By MaleRadio=By.xpath("//input[@id='gender-male']");
    By FirstNameField = By.xpath("//input[@id='FirstName']");
    By LastNameField = By.xpath("//input[@id='LastName']");
    By BirthDropDown = By.xpath("//select[@name='DateOfBirthDay']");
    By BirthMonthDropdown= By.xpath("//select[@name='DateOfBirthMonth']");
    By BirthYearDropdown=By.xpath("//select[@name='DateOfBirthYear']");
    By EmailField = By.xpath("//input[@id='Email']");
    By PasswordField = By.xpath("//input[@id='Password']");
    By ConfirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By RegisterButton = By.xpath("//button[@id='register-button']");
    By ErrorMassage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By RegisteronCompleted = By.xpath("//div[@class='result']");
    By Continue = By.xpath("//a[normalize-space()='Continue']");
    By Register = By.xpath("//h1[normalize-space()='Register']");
    By NameFieldError = By.xpath("//span[@id='FirstName-error']");
    By LastNameError = By.xpath("//span[@id='LastName-error']");
    By EmailFiledError = By.xpath("//span[@id='Email-error']");
    By PasswordFieldError =By.xpath("//span[@id='Password-error']");
    By ConforimPasswordFieldError = By.xpath("//span[@id='ConfirmPassword-error']");



    public String findRegisterText(){return getTextFromElement(RegisterText);}
    public void cilckMaleFemaleRadio(){ clickOnElement(MaleRadio);}
    public void enterFirstnameField(String fname){sendTextToElement(FirstNameField,fname);}
    public void enterLastnameField(String lname){sendTextToElement(LastNameField,lname);}
    public void ClickDateOfDropDown(String value){selectByValueFromDropDown(BirthDropDown,value);}
    public void ClickMonthOfDropdown(String value){selectByValueFromDropDown(BirthMonthDropdown,value);}
    public void ClickYearOfDropdown(String value){selectByValueFromDropDown(BirthYearDropdown,value);}
    public void enterEmailField(String eid){sendTextToElement(EmailField,eid);}
    public void enterPasswordField(String password){sendTextToElement(PasswordField,password);}
    public void eneterComfirmPassword(String cpaasword){sendTextToElement(ConfirmPasswordField,cpaasword);}

    public void CilckOnRegister(){
       clickOnElement(RegisterButton);}
    public String VerifyErrorMassage(){return getTextFromElement(ErrorMassage);}
    public String VerifyRegisterComplateText(){return getTextFromElement(RegisteronCompleted);}
public String ContinueButton(){return getTextFromElement(Continue);}
    public String verifyRegisterText(){return getTextFromElement(Register);}
    public String verifyFristNameIsRequired(){
        return getTextFromElement(NameFieldError);
    }
    public String verifyLastNameIsRequiredText(){return getTextFromElement(LastNameError);}
    public String verifyEmailIsRequiredText(){return getTextFromElement(EmailFiledError);}
    public String verifyPasswordIsRequiredText(){return getTextFromElement(PasswordFieldError);}
    public String verifyConfirmPasswordIsRequiredText(){return getTextFromElement(ConforimPasswordFieldError);}


}
/*Click on Register Link
        Click on "REGISTER" button
        Verify the error message "First name is required."
        Verify the error message "Last name is required."
        Verify the error message "Email is required."
        Verify the error message "Password is required."
        Verify the error message "Password is required."  */