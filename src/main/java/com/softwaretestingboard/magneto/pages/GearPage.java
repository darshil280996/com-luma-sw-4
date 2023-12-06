package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utilites.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnOvernightDuffle() {
        clickOnElement(overnightDuffle);
    }
}
