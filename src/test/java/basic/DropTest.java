package basic;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropTest extends TestBase {
@Test
    public void shouldDragAndDropV1(){
        driver.get("http://www.seleniumui.moderntester.pl/droppable.php#");
        WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
        WebElement areaToDrop = driver.findElement(By.cssSelector("#droppable"));


        Actions actions = new Actions(driver);

        actions.clickAndHold(draggable)
                .moveToElement(areaToDrop)
                .release()
                .perform();

        Assert.assertEquals(areaToDrop.getText(),"Dropped!");
    }

}
