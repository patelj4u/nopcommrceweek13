package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By clickDesktopsButton=By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");
    By verifyDesktopsText = By.xpath("//h1[normalize-space()='Desktops']");
    By Sortby = By.xpath("//span[normalize-space()='Sort by']");
    By Display = By.xpath("//span[normalize-space()='Display']");
    By selectProductList = By.xpath("//a[normalize-space()='List']");

    public String verifyDesktopsText(){
        return getTextFromElement(verifyDesktopsText);

    }
    public String verifySortby(){
        return getTextFromElement(Sortby);

    }
    public String verifyDisplay(){
        return getTextFromElement((Display));

}
public String verifySelecetd(){
        return getTextFromElement(selectProductList);
}

public void clickDesktopsButton() {clickOnElement(clickDesktopsButton);




}}
