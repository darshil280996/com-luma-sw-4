package com.softwaretestingboard.magneto.testsuite;


import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.WomensJacketsPage;
import com.softwaretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homepage = new HomePage();
    WomensJacketsPage womenPage = new WomensJacketsPage();


    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        Thread.sleep(3000);
        //Mouse Hover on Tops
        homepage.mouseHoverOnTops();
        Thread.sleep(3000);
        //Click on Jackets
        homepage.clickOnJackets();
        Thread.sleep(3000);
        //Select Sort By filter “Product Name”
        womenPage.selectProductNameFilter("Product Name");
        Thread.sleep(3000);
        //Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());
        Thread.sleep(3000);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        Thread.sleep(3000);
        //Mouse Hover on Tops
        homepage.mouseHoverOnTops();
        Thread.sleep(3000);
        //Click on Jackets
        homepage.clickOnJackets();
        Thread.sleep(3000);
        //Select Sort By filter “Price”
        womenPage.selectProductNameFilter("Price");
        Thread.sleep(3000);
        //Verify the products price display in Low to High
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());
        Thread.sleep(3000);
    }
}
