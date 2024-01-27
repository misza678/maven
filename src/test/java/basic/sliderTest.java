package basic;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sliderTest extends TestBase {

    @Test

    public void moveSlider(){

        driver.get("http://seleniumui.moderntester.pl/slider.php");

        WebElement slider=driver.findElement(By.xpath("//div[@id='custom-handle']"));

        for(int i=0;i<50;i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

        Assert.assertEquals(slider.getText(),"40");

        for(int i=0;i<20;i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
        Assert.assertEquals(slider.getText(),"30");
        System.out.println(slider.getText());

        }
    }


