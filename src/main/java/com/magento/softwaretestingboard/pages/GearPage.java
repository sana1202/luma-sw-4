package com.magento.softwaretestingboard.pages;

import com.magento.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnOvernightDuffle() {
        clickOnElement(overnightDuffle);
    }
}
