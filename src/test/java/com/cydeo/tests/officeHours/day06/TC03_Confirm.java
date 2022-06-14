package com.cydeo.tests.officeHours.day06;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_Confirm extends TestBase {


    @Test
    public void confirmAlert(){

 //    - Open "http://www.uitestpractice.com/Students/Switchto"
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        WebElement confirmBtn = driver.findElement(By.id("confirm"));
 //            - Click Confirm
        confirmBtn.click();

//			- Click Cancel button from Alert
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

//			- Verify message equals "You pressed Cancel in confirm window"
        WebElement message = driver.findElement(By.id("demo"));

        Assert.assertEquals(message.getText(),"You pressed Cancel in confirm window");

    }


}
