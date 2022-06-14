package com.cydeo.tests.officeHours.day06;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_Information extends TestBase {


    @Test
    public void infoAlert(){

//    - Open "http://www.uitestpractice.com/Students/Switchto"
        driver.get("http://www.uitestpractice.com/Students/Switchto");
//           - Click Alert
        WebElement alertBtn = driver.findElement(By.id("alert"));
        alertBtn.click();
//			- Click OK button from org.openqa.selenium.Alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
//			- Verify message equals "You have clicked on ok button in alert window"
        WebElement message = driver.findElement(By.xpath("//div[@id='demo']"));
        Assert.assertEquals(message.getText(),"You have clicked on ok button in alert window");


    }






}
