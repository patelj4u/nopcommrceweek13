package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By registerLink = By.xpath("//a[@class='ico-register']");
    By LoginLink = By.xpath("//a[@class='ico-login']");

    By logoLink = By.xpath("//img[@alt='nopCommerce demo store']");

    By myaccountlink = By.xpath("//button[@class='button-1 login-button']");

    By logOutLink = By.xpath("//a[@class='ico-logout']");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public  void clickOnLoginLink(){clickOnElement(LoginLink);}

    public void findLogo(){clickOnElement(logoLink);}
    public void clickOnLoginButton(){
        clickOnElement(myaccountlink);
    }

    public void clickOnLogoutButton(){
        clickOnElement(logOutLink);
    }


}
