package com.softwaretestingboard.magneto.testsuite;

import com.softwaretestingboard.magneto.pages.GearPage;
import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.OverNightDufflePage;
import com.softwaretestingboard.magneto.pages.ShoppingCartPage;
import com.softwaretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    OverNightDufflePage overNightDuffle = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
        Thread.sleep(3000);
        //Click on Bags
        homePage.clickOnBags();
        Thread.sleep(3000);
        //Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();
        Thread.sleep(3000);
        //Verify the text ‘Overnight Duffle’
        Assert.assertEquals(overNightDuffle.getOverNightDuffelText(), "Overnight Duffle");
        Thread.sleep(3000);
        //Change Qty 3
        overNightDuffle.changeQuantityTo3("3");
        Thread.sleep(3000);
        //Click on ‘Add to Cart’ Button.
        overNightDuffle.clickOnAddToCart();
        Thread.sleep(3000);
        //Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(overNightDuffle.getAddToCartText(), "You added Overnight Duffle to your shopping cart.");
        Thread.sleep(3000);
        //Click on ‘shopping cart’ Link into message
        overNightDuffle.clickOnShoppingCart();
        Thread.sleep(3000);
        //Verify the text ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.getOverNightDuffleText(), "Overnight Duffle");
        Thread.sleep(3000);
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.getQty(), "3");
        Thread.sleep(3000);
        //Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$135.00");
        Thread.sleep(3000);
        //Change Qty to ‘5’
        shoppingCartPage.changeQtyOfOverNightDuffle("5");
        Thread.sleep(3000);
        //Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        Thread.sleep(3000);
        //Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCartPage.getUpdatedProductPrice(), "$225.00");
        Thread.sleep(3000);
    }
}
