package com.nopcommerce.demo.testsuites;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage register = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    // DesktopsPage Desktops = new DesktopsPage();
    // ComputerPage computer = new ComputerPage();
    // BuildYourOwnComputerPage build = new BuildYourOwnComputerPage();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register Link
        homePage.clickOnRegisterLink();
        //Verify "Register" text
        Assert.assertEquals("Register", register.verifyRegisterText());
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,800)");
        register.CilckOnRegister();

        String expected = "First name is required.";
        Assert.assertEquals(register.verifyFristNameIsRequired(),expected);

        String expected1 = "Last name is required.";
        Assert.assertEquals(register.verifyLastNameIsRequiredText(),expected1);

        String expected2 = "Email is required.";
        Assert.assertEquals(register.verifyEmailIsRequiredText(),expected2);

        String expected3 = "Password is required.";
        Assert.assertEquals(register.verifyPasswordIsRequiredText(),expected3);

        String expected4 = "Password is required.";
        Assert.assertEquals(register.verifyConfirmPasswordIsRequiredText(),expected4);
    }
    @Test
    public void  verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        register.cilckMaleFemaleRadio();
        register.enterFirstnameField("Jiten");
        register.enterLastnameField("Patel");
        Thread.sleep(1000);
        register.ClickDateOfDropDown("7");
        register.ClickMonthOfDropdown("6");
        register.ClickYearOfDropdown("1986");
        Thread.sleep(1000);
        Random randomGenrator = new Random(System.currentTimeMillis());
        int num = randomGenrator.nextInt(3);
        register.enterEmailField("Jiten"+num+"@gmail.com");
        register.enterPasswordField("Abcd123");
        register.eneterComfirmPassword("Abcd123");
        register.CilckOnRegister();

        String expected = "Your registration completed";
        Assert.assertEquals(register.VerifyRegisterComplateText(),expected);
    }


}/*Click on Register Link
Select gender "Female"
Enter firstname
Enter lastname
Select day
Select month
Select year
Enter email
Enter password
Enter Confirm Password
Click on "REGISTER" button
Verify message "Your registration completed"
 */
