package com.cydeo.tests.officeHours.day06.iframehw;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyChildFrame extends TestBase {

    @Test
    public void verifyChildFrame(){
//        - Open "https://demoqa.com/frames"
        driver.get("https://demoqa.com/frames");
//        - Verify child frames texts are equal : "This is a sample page"
      driver.switchTo().frame("frame1");

      WebElement frameTxt = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(frameTxt.getText(),"This is a sample page");

    }
}
