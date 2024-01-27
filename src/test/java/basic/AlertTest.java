package basic;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlertTest extends TestBase {
@Test
    public void ShouldAcceptSimpleAlert(){

        driver.get("http://www.seleniumui.moderntester.pl/alerts.php");
        driver.findElement(By.cssSelector("#simple-alert")).click();
        driver.switchTo().alert().accept();
        String result= driver.findElement(By.cssSelector("#simple-alert-label")).getText();
        Assert.assertEquals(result, "OK button pressed");
    }



    @Test
    public void shouldFillPromptAlert(){
        driver.get("http://www.seleniumui.moderntester.pl/alerts.php");
        driver.findElement(By.cssSelector("#prompt-alert")).click();
        driver.switchTo().alert().sendKeys("Jan");
        driver.switchTo().alert().accept();
        String result= driver.findElement(By.cssSelector("#prompt-label")).getText();
        Assert.assertEquals(result, "Hello Jan! How are you today?");
    }

    @Test
    public void ShouldDissmissSimpleAlert(){

        driver.get("http://www.seleniumui.moderntester.pl/alerts.php");
        driver.findElement(By.cssSelector("#confirm-alert")).click();
        driver.switchTo().alert().dismiss();
        String result= driver.findElement(By.cssSelector("#confirm-label")).getText();
        Assert.assertEquals(result, "You pressed Cancel!");
    }
}
