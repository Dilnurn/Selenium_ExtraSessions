package com.cydeo.tests.officeHours.day06;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_Prompt extends TestBase {


    @Test
    public void promptAlert(){
//        - Open "http://www.uitestpractice.com/Students/Switchto"
        driver.get("http://www.uitestpractice.com/Students/Switchto");
//                - Click Prompt
        WebElement promptBtn = driver.findElement(By.xpath("//button[.='Prompt']"));
        promptBtn.click();
//                - Send name as "Mike" into this alert field
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Mike");
//        - CLick OK
        alert.accept();

//        - Verify  message contains "Mike"
        WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Hello Mike')]"));
        Assert.assertTrue(message.getText().contains("Mike"));

    }
}
