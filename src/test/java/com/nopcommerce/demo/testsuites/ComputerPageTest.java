package com.nopcommerce.demo.testsuites;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    ComputerPage computer=new ComputerPage();
    DesktopsPage desktops=new DesktopsPage();
    BuildYourOwnComputerPage Build=new BuildYourOwnComputerPage();
   @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
       computer.clickOnComputerButton();
       Assert.assertEquals("Computers", computer.ComputersText());


    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
       computer.clickOnComputerButton();
       desktops.clickDesktopsButton();
       String expected = "Desktops";
       Assert.assertEquals("Desktops",desktops.verifyDesktopsText());


    }
    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(){
       computer.clickOnComputerButton();
       desktops.clickDesktopsButton();
       Build.clickOwnComputer();
       Build.clickProcessorDropDown();
       Build.clickRamDropDown();
       Build.clickHddRadio();
       Build.clickOsradio();
       Build.clickSoftware();
       Build.AddToCardButton();
       String expected="The product has been added to your shopping cart";
       Assert.assertEquals(Build.verifyItemInYourCart(),expected);



    }
}
/*Click on Computer tab
Click on Desktops link
Click on product name "Build your own computer"
Select processor "processor"
Select RAM "ram"
Select HDD "hdd"
Select OS "os"
Select Software "software"
Click on "ADD TO CART" Button
Verify message "The product has been added to your shopping cart"*/