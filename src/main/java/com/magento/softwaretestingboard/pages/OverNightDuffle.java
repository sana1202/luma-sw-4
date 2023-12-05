package com.magento.softwaretestingboard.pages;

import com.magento.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDuffle extends Utility {
    By overNightDuffleText = By.xpath("//span[@class='base']");
    By qty = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By addToCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public String getOverNightDuffelText() {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty) {
        driver.findElement(qty).clear();
        sendTextToElement(qty, newQty);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getAddToCartText() {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }
}
