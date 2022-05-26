package com.cydeo.tests.officeHours.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_GetAttribute {
    public static void main(String[] args) {
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/
//        3- Click Registration Form
//        4- Verify following fields has these default values
//                - First name ---> first name
//                - Last name  ---> last name
//                - Username   ---> username

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");
        driver.findElement(By.linkText("Registration Form")).click();
       String firstName =  driver.findElement(By.name("firstname")).getAttribute("placeholder");
       String lastName = driver.findElement(By.name("lastname")).getAttribute("placeholder");
       String userName = driver.findElement(By.name("username")).getAttribute("placeholder");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(userName);




       driver.quit();






    }
}
