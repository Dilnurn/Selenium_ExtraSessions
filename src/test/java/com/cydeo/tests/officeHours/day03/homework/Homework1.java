package com.cydeo.tests.officeHours.day03.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {

//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        WebElement rememberMe = driver.findElement(By.xpath("//label[@class='login-item-checkbox-label']"));
        System.out.println("rememberMe.isDisplayed() = " + rememberMe.isDisplayed());

//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?
        WebElement forgotPsw = driver.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
        System.out.println("forgotPsw.isDisplayed() = " + forgotPsw.isDisplayed());
//     5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes
        String actual = forgotPsw.getAttribute("href");
        String expected = "forgot_password=yes";

        if (actual.contains(expected)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

driver.quit();

//        PS: Inspect and decide which locator you should be using to locate web
//        elements.










    }
}
