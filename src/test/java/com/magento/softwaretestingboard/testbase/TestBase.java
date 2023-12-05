package com.magento.softwaretestingboard.testbase;

import com.magento.softwaretestingboard.propertyreader.PropertyReader;
import com.magento.softwaretestingboard.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
