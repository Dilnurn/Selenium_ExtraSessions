package com.cydeo.tests.officeHours.day05;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P02_isDisplay {

    @Test
    public void isDisplayTest(){

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/registration_form");

        WebElement errorMessage = driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']"));

        System.out.println(errorMessage.getText());
        System.out.println(errorMessage.isDisplayed());

        driver.findElement(By.name("firstname")).sendKeys("a");
        System.out.println(errorMessage.isDisplayed());
        System.out.println(errorMessage.getText());

        errorMessage.click();
        System.out.println("We clicked this element without any exception since it is display");

        driver.quit();

    }
}
