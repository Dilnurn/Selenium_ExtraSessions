package com.cydeo.tests.officeHours.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MoneyGaming {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// 1. Navigate to: https://moneygaming.qa.gameaccount.com/
        driver.get("https://moneygaming.qa.gameaccount.com/");
// 2. Click the JOIN NOW button to open the registration page
        WebElement joinNowBtn = driver.findElement(By.xpath("//a[@class='newUser green']"));
        joinNowBtn.click();
// 3. Select a title value from the dropdown
        Select selectTitle = new Select(driver.findElement(By.xpath("//select[@id='title']")));
        selectTitle.selectByVisibleText("Ms");

// 4. Enter your first name and surname in the form
        WebElement firstName = driver.findElement(By.xpath("//input[@name='map(firstName)']"));
        firstName.sendKeys("Dilnur");
        WebElement surName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surName.sendKeys("Nijat");
// 5. Check the tickbox with text "I accept the Terms and Conditions and certify that I am over the age of 18.
        WebElement tickbox = driver.findElement(By.xpath("//input[@name='map(terms)']"));
        tickbox.click();

// 6. Submit the form by clicking the JOIN NOW button
        WebElement joinNow2 = driver.findElement(By.xpath("//input[@class='promoReg green']"));
        joinNow2.click();


// 7. Validate that a validation message with text "This field is required" appears under the date of birth box
        WebElement validationMSG = driver.findElement(By.xpath("//label[@for='dob']"));
        String expected = "This field is required";
        String actual = validationMSG.getText();

        if (actual.equals(expected)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
      driver.quit();



    }


}
