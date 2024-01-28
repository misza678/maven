package basic;

import base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class DelayTest extends TestBase {
    @Test

    public void delayTest(){

        driver.get("http://www.seleniumui.moderntester.pl/alerts.php");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='delayed-alert']")).click();


        Alert alert= wait.until(ExpectedConditions.alertIsPresent());


        driver.switchTo().alert().accept();


        WebElement alertLbl = driver.findElement(By.cssSelector("#delayed-alert-label"));
        Assert.assertEquals(alertLbl.getText(), "OK button pressed");
    }
}

