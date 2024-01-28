package other;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasketTest extends TestBase {

    @Test
    public void shouldAddProductToBasket(){
        driver.get("http://146.59.32.4/index.php?id_product=6&rewrite=mug-the-best-is-yet-to-come&controller=product&id_lang=2");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[@class='btn btn-primary add-to-cart']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='material-icons float-xs-left']"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i[@class='material-icons float-xs-left']")));
        String text= driver.findElement(By.xpath("//span[@class='no-items']")).getText();
        Assert.assertEquals(text,"There are no more items in your cart");
    }




}