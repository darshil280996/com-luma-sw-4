package com.softwaretestingboard.magneto.testbase;

import com.softwaretestingboard.magneto.propertyreader.PropertyReader;
import com.softwaretestingboard.magneto.utilites.Utility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public  void setUp(){
        selectBrowser(browser);

    }
    @AfterTest
    public void tearDown(){
        closeBrowser();
    }

}
