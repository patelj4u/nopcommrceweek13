package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By ComputerText = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By ProcessorDropDown = By.xpath("//select[@id='product_attribute_1']");

    By RamDropDown = By.xpath("//select[@id='product_attribute_2']");

    By HddRadio = By.xpath("//input[@id='product_attribute_3_6']");

    By OsRadio = By.xpath("//input[@id='product_attribute_4_8']");

    By SoftwareCheckBoxes = By.xpath("//input[@id='product_attribute_5_10']");

    By AddToCardButton = By.xpath("//button[@id='add-to-cart-button-1']");

    By ShoppingCart = By.xpath("//span[@class='cart-label']");
    By clickBuildOwnComputer=By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
By verifyItemInCart=By.xpath("//p[@class='content']");
    public String VerifyComputerText(){
        return getTextFromElement(ComputerText);
    }
    public void clickProcessorDropDown(){
        clickOnElement(ProcessorDropDown);
    }
    public void clickRamDropDown(){
        clickOnElement(RamDropDown);
    }
    public void clickHddRadio(){
        clickOnElement(HddRadio);
    }
    public void clickOsradio(){
        clickOnElement(OsRadio);
    }
    public void clickSoftware(){
        clickOnElement(SoftwareCheckBoxes);
    }
    public void Verifyshoppingcart(){
        clickOnElement(ShoppingCart);
    }
    public void AddToCardButton(){clickOnElement(AddToCardButton);}
    public void clickOwnComputer(){clickOnElement(clickBuildOwnComputer);}
    public String verifyItemInYourCart(){return getTextFromElement(verifyItemInCart);}
}


