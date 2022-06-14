package com.cydeo.tests.officeHours.day05;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P01_ImplicitWait {



    @Test
    public void test01() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/dynamic_loading/4");

        //Thread.sleep(6000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//this page need more than 5 seconds

        String helloWorldText = driver.findElement(By.cssSelector("#finish")).getText();

        System.out.println(helloWorldText);

        driver.quit();

    }
}
