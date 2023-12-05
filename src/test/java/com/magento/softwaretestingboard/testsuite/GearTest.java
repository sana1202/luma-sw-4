package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.GearPage;
import com.magento.softwaretestingboard.pages.HomePage;
import com.magento.softwaretestingboard.pages.OverNightDuffle;
import com.magento.softwaretestingboard.pages.ShoppingCartPage;
import com.magento.softwaretestingboard.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    OverNightDuffle overNightDuffle = new OverNightDuffle();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnOvernightDuffle();
        Assert.assertEquals(overNightDuffle.getOverNightDuffelText(), "Overnight Duffle");
        overNightDuffle.changeQuantityTo3("3");
        overNightDuffle.clickOnAddToCart();
        Assert.assertEquals(overNightDuffle.getAddToCartText(), "You added Overnight Duffle to your shopping cart.");
        overNightDuffle.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getOverNightDuffleText(), "Overnight Duffle");
        Assert.assertEquals(shoppingCartPage.getQty(), "3");
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$135.00");
        shoppingCartPage.changeQtyOfOverNightDuffle("5");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getUpdatedProductPrice(), "$225.00");
    }
}
