package com.cydeo.tests.officeHours.day03.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {

//        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
//        3- Enter incorrect username into login box:
        WebElement loginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBox.sendKeys("efeee");
//        4- Click to `Reset password` button
        WebElement resetPsw = driver.findElement(By.xpath("//button[@class='login-btn']"));
        resetPsw.click();

//        5- Verify “error” label is as expected
        WebElement errorLabel = driver.findElement(By.xpath("//div[@class='errortext']"));
//        Expected: Login or E-mail not found
        String erroMsg = errorLabel.getText();
        String expected = "Login or E-mail not found";

        if (erroMsg.equals(expected)){
            System.out.println("errorLabel.isDisplayed() = " + errorLabel.isDisplayed());
        }else{
            System.err.println("FAILED");
        }

driver.quit();










    }
}
