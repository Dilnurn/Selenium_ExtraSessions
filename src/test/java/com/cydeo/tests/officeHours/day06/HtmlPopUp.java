package com.cydeo.tests.officeHours.day06;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.html.HTML;
import java.util.concurrent.TimeUnit;

public class HtmlPopUp {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void htmlPopUp(){


//  - Open "https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=5f126"
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=5f126");
//   - Click Confirm button

        WebElement confirmBtn = driver.findElement(By.xpath("//button[@id='j_idt311:j_idt312']"));
        confirmBtn.click();
//  - Click YES from pop up
        WebElement pouUp = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
        pouUp.click();
//   - Verify message equals "You have accepted"
      WebElement message  = driver.findElement(By.xpath("//p[contains(text(),\"You have\")]"));
        Assert.assertEquals(message.getText(),"You have accepted");

    }
}
