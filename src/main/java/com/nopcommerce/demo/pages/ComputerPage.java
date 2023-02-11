package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By ComputerLink=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By ComputersText = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    By DesktopsLink = By.xpath("//ul[@class='top-menu notmobile']//li[1]//ul[1]");

    By NotebooksLink = By.xpath("//ul[@class='top-menu notmobile']//li[1]//ul[1]//li[1]");

    By SoftwareLink = By.xpath("//li[@class='active last']//a[normalize-space()='Software']");


    public String ComputersText(){
        return getTextFromElement(ComputersText);
    }
    public String getDesktopsLink() {
        return getTextFromElement(DesktopsLink);
    }
    public String getNoteBooksLinks1(){
        return getTextFromElement(NotebooksLink);
    }
    public String getSoftwareLink1(){
        return getTextFromElement(SoftwareLink);
    }
    public void clickOnComputerButton(){
        clickOnElement(ComputerLink);
    }
}