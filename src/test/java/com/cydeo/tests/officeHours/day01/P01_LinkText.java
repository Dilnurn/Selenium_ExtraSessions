package com.cydeo.tests.officeHours.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P01_LinkText {
    public static void main(String[] args) throws InterruptedException {

    /*

    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/
    3- Click to Multiple Buttons   (by using linkText locator)
    4- Verify title equals:
       Expected: Multiple Buttons
    5- Go back to home page by using the .back();
    6- Verify title equals:
       Expected: Practice

 */

 /*
 When you got the TASK

 1- Read and try to understand requirements
 2- Manually execute this task

      -Functionality should not be broken (needs to work well)
      -Is this automobile
      -If YES automate it

  LOCATORS -> MILESTONES OF SELENIUM

  How many type locators we have?

  - ID
  - NAME
  - CLASSNAME
  - TAGNAME
  - PARTIALLINKTEXT

  -XPath
  -CSS


  */
        // set up driver
        WebDriverManager.chromedriver().setup();

        //Create an instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        WebElement multiple_buttons= driver.findElement(By.linkText("Multiple Buttons"));
        multiple_buttons.click();

        // driver.findElement(By.linkText("Multiple Buttons")).click();

        Thread.sleep(3000); //checked exception

        String expectedTitle = "Multiple Buttons";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");


        }else{
            System.err.println("FAILED");
        }

        driver.navigate().back();
        Thread.sleep(3000);


        actualTitle = driver.getTitle();

        if (actualTitle.equals("Practice")){
            System.out.println("PASSED");
        }else{
            System.err.println("FAILED");
        }

        Thread.sleep(3000);

        // close current tab -  driver.close()


        driver.quit();













    }
}
