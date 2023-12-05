package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.HomePage;
import com.magento.softwaretestingboard.pages.MenPage;
import com.magento.softwaretestingboard.pages.ShoppingCartPage;
import com.magento.softwaretestingboard.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnBottom();
        homePage.clickOnPant();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        menPage.clickOnColor();
        menPage.clickOnAddToCart();
        Assert.assertEquals(menPage.getTextAfterAddToCart(), "You added Cronus Yoga Pant to your shopping cart.");
        menPage.clickOnShoppingCart();
        //Assert.assertEquals(shoppingCart.getShoppingCart(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.getCronusYogaPantText(), "Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.getSizeText(), "32");
        Assert.assertEquals(shoppingCart.getColorText(), "Black");

    }
}
