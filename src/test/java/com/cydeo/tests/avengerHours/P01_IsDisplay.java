package com.cydeo.tests.avengerHours;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P01_IsDisplay extends TestBase {

    @Test
    public void test(){
//        1-Navigate to "http://www.uitestpractice.com/"
        driver.get("http://www.uitestpractice.com/");
//        2-Verify main page is launched;
//        -"Testing Controls" Tab should be displayed on left top (visible and enabled)
        WebElement testingControlTab = driver.findElement(By.xpath("//a[.='Testing Controls ']"));
        System.out.println("testingControlTab.isDisplayed() = " + testingControlTab.isDisplayed());
        System.out.println("testingControlTab.isEnabled() = " + testingControlTab.isEnabled());

    }
}
