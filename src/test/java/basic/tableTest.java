package basic;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class tableTest extends TestBase {

    @Test

    public void moveSlider(){

        driver.get("http://seleniumui.moderntester.pl/table.php");

        List<WebElement> wiersze=driver.findElements(By.xpath("//tbody/tr"));


        for (WebElement wiersz : wiersze) {

            int height = Integer.parseInt(wiersz.findElement(By.xpath("td[4]")).getText());


            if(height>4000) {
                List<WebElement> komórki = wiersz.findElements(By.tagName("td"));
                for(WebElement komórka : komórki){
                    System.out.print(komórka.getText()+"\t");
                }
                System.out.println();
            }
        }
    }

}
