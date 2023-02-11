package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailfield = By.id("Email");
    By passwordField=By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By Computers = By.linkText("Computers");
    By Digitaldownloads = By.linkText("Digitaldownloads");
    By Electronics = By.linkText("Electronics");
    By Apparel = By.linkText("Apparel");
    By Books = By.linkText("Books");
    By Jewelery = By.linkText("Jewelery");
    By GiftCards = By.linkText("GiftCards");




    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");
    public String verifyWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailfield,email);
    }

    public  void enterPassword(String Password){
        sendTextToElement(passwordField,Password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnComputers() {
        Reporter.log("clicking on Computers" + Computers.toString());clickOnElement(Computers);}
    public void clickOnElectronics() {
        Reporter.log("clicking on Electronics" + Electronics.toString());clickOnElement(Electronics);}

    public void Apparel() {Reporter.log("clicking on Apparel" + Apparel.toString());clickOnElement(Apparel);}

    public void clickOnDigitaldownloads() {Reporter.log("clicking on Digitaldownloads" + Digitaldownloads.toString());
        clickOnElement(Digitaldownloads);}

    public void clickOnBooks() {
        Reporter.log("clicking on Books" + Books.toString());
        clickOnElement(Books);
    }

    public void clickOnJewelery() {
        Reporter.log("clicling on Jewelery" + Jewelery.toString());
        clickOnElement(Jewelery);
    }

    public void clickOnGiftCards() {
        Reporter.log("clicking on GiftCards" + GiftCards.toString());
        clickOnElement(GiftCards);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMag);
    }

}
