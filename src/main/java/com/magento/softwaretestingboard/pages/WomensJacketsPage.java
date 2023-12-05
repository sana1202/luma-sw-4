package com.magento.softwaretestingboard.pages;

import com.magento.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomensJacketsPage extends Utility {
    By productFilter = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By nameList1 = By.xpath("//strong[@class = 'product name product-item-name']");
    By nameList2 = By.xpath("//strong[@class = 'product name product-item-name']");
    By priceList1 = By.xpath("//span[@class='price-container price-final_price tax weee']");
    By priceList2 = By.xpath("//span[@class='price-container price-final_price tax weee']");


    public ArrayList<String> getProductList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(nameList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public void selectProductNameFilter(String filterName) {
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> getProductList2() {
        List<WebElement> afterFilterProductList = driver.findElements(nameList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

        return afterFilterProductList1;
    }


    public ArrayList<String> getPriceList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(priceList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getPriceList2() {
        List<WebElement> afterFilterProductList = driver.findElements(priceList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        return afterFilterProductList1;
    }
}
