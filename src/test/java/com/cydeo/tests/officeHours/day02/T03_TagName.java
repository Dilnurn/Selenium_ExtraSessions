package com.cydeo.tests.officeHours.day02;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_TagName {
//            1- Open a chrome browser
//            2- Go to: https://practice.cydeo.com/
//            3- Verify first link text is "Home"
public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://practice.cydeo.com/");
    String linkText = driver.findElement(By.tagName("a")).getText();
    System.out.println(linkText);
    driver.quit();





}

}
