package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.resources.L10N;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc001 implements IAbstractTest {

    @Test
    public void openHomeTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.findExtendedWebElement(By.linkText("Big page with many elements")).click();
        L10N.assertAll();
    }

}
