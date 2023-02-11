package com.nopcommerce.demo.testsuites;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){
        //Click on login link
        homePage.clickOnLoginLink();

        //verify that "Welcome, Please Sign In!" message display
        Assert.assertEquals("Welcome, Please Sign In!",loginPage.verifyWelcomeText());
    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
           homePage.clickOnLoginLink();
        loginPage.enterEmailId("jiten111@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getErrorMessage();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual, expected, "error message with inavalid credentials");
    }
@Test
    public void  verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
    loginPage.enterEmailId("jiten@gmail.com");
    loginPage.enterPassword("123456");
    loginPage.clickOnLoginButton();
   homePage.clickOnLogoutButton();


}
@Test
public void   VerifyThatUserShouldLogOutSuccessFully(){
    homePage.clickOnLoginLink();
    loginPage.enterEmailId("jiten@gmail.com");
    loginPage.enterPassword("123456");
    loginPage.clickOnLoginButton();
    homePage.clickOnLogoutButton();

}}
