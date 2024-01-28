package basic;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class progressBar extends TestBase {

    @Test
            public void progressFind(){

        driver.get("http://www.seleniumui.moderntester.pl/progressbar.php");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='progress-label']"), "Complete!"));

    }



    @Test
    public void progressFindClass(){

        driver.get("http://www.seleniumui.moderntester.pl/progressbar.php");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.attributeToBe(By.className("ui-progressbar-value"), "class", "ui-progressbar-value ui-corner-left ui-widget-header ui-progressbar-complete ui-corner-right"));

    }
}
