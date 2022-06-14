package com.cydeo.tests.officeHours.day06.iframehw;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_MiddleFrame extends TestBase {

    @Test
    public void middleFrame(){

//        - Open "http://practice.cybertekschool.com/nested_frames"
        driver.get("http://practice.cybertekschool.com/nested_frames");
//                - Switch to middle frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']"))).switchTo().frame(1);
        WebElement textMiddle = driver.findElement(By.xpath("//div[@id='content']"));
//                - Verify text is equal "MIDDLE"
        Assert.assertEquals(textMiddle.getText(),"MIDDLE");
//                - Switch to right frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']"))).switchTo().frame(2);
//                - Verify text is equal "RIGHT"
        WebElement textRight = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
        Assert.assertEquals(textRight.getText(),"RIGHT");
//                - Switch to bottom frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
//                - Verify text is equal "BOTTOM"
        WebElement textBottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
        Assert.assertEquals(textBottom.getText(),"BOTTOM");
    }
}
