package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.HomePage;
import com.magento.softwaretestingboard.pages.WomensJacketsPage;
import com.magento.softwaretestingboard.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Write down the following test into WomenTestclass
1. verifyTheSortByProductNameFilter
* Mouse Hover on Women Menu
* Mouse Hover on Tops
* Click on Jackets
* Select Sort By filter “Product Name”
* Verify the products name display in
alphabetical order
2. verifyTheSortByPriceFilter
* Mouse Hover on Women Menu
* Mouse Hover on Tops
* Click on Jackets
* Select Sort By filter “Price”
* Verify the products price display in
Low to High
 */
public class WomenTest extends TestBase {

    HomePage homepage = new HomePage();
    WomensJacketsPage womenPage = new WomensJacketsPage();


    @Test
    public void verifyTheSortByProductNameFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenPage.selectProductNameFilter(" Product Name ");
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenPage.selectProductNameFilter(" Price ");
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());
    }
    }

