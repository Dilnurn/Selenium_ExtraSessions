package com.cydeo.tests.officeHours.day03.homework;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) {

//        TC #3: Practice Cydeo/ForgotPassword URL verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2. Go to http://practice.cydeo.com/forgot_password
        driver.get("http://practice.cydeo.com/forgot_password");
//        3. Enter any email into input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys("etwtret@gmail.com");
        WebElement retrievePsw = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

//        4. Click on Retrieve password
        retrievePsw.click();
        String actual = driver.getCurrentUrl();
//        5. Verify URL contains:
//        Expected: “email_sent”
        if (actual.contains("email_sent")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
//        6. Verify textbox displayed the content as expected.
//                Expected: “Your e-mail’s been sent!”
        WebElement textBox = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        System.out.println("textBox.isDisplayed() = " + textBox.isDisplayed());

        driver.quit();


    }
}
