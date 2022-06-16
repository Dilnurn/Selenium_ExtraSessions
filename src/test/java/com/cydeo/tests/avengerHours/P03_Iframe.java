package com.cydeo.tests.avengerHours;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P03_Iframe extends TestBase {

    @Test
    public void iframe(){


//        1- Navigate to "http://www.uitestpractice.com/"
        driver.get("http://www.uitestpractice.com/");
//        2- Type the name into "Enter your name" inputbox -> "Mike Johnson"

       WebElement inputBox =  driver.switchTo().frame("iframe_a").findElement(By.id("name"));
//        3- Retrieve the name from inputbox -> "Mike Johnson"
        inputBox.sendKeys("Mike Johnson");
        System.out.println("inputBox.getAttribute(\"value\") = " + inputBox.getAttribute("value"));
        driver.switchTo().defaultContent();
//        4- Click on the link "uitestpractice.com"
        WebElement link = driver.findElement(By.xpath("//a[.='uitestpractice.com']"));
        link.click();
//        5- Verify "Drag and Drop control" menu is displayed in iframe
        driver.switchTo().frame("iframe_a");
        WebElement dragAndDropControl = driver.findElement(By.xpath("(//h3[.='Drag and Drop control'])[1]"));
        Assert.assertTrue(dragAndDropControl.isDisplayed(),"Failed");
    }
}
