package com.magento.softwaretestingboard.pages;

import com.magento.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By tops = By.xpath("//a[@id='ui-id-9']");
    By jackets = By.xpath("//a[@id='ui-id-11']");
    By menMenu = By.xpath("//a[@id='ui-id-5']");
    By bottomMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By bags = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() {
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPant() {
        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        clickOnElement(bags);
    }
}
