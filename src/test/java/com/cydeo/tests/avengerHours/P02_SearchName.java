package com.cydeo.tests.avengerHours;

import com.cydeo.tests.officeHours.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P02_SearchName extends TestBase {


    @Test
    public void test(){
//        1-Navigate to website "http://www.uitestpractice.com/";
        driver.get("http://www.uitestpractice.com/");
//        2-Click on Home tab
        WebElement homeTab = driver.findElement(By.xpath("//a[.='Home']"));
        homeTab.click();
//        3-Search for the name "Mike Johnson"
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='form-control']"));
        searchBox.sendKeys("Mike Johnson");
        WebElement findBtn = driver.findElement(By.xpath("//input[@type='submit']"));

        findBtn.click();
//        4-Verify "There are zero students with this search text Page 0 of 0" msg displayed on page
        WebElement msgText = driver.findElement(By.xpath("//div[2]/div[1]"));
        String expected = "There are zero students with this search text Page 0 of 0";
        Assert.assertTrue(msgText.getText().contains(expected));


    }
}
