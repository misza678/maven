package basic;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class FormTest extends TestBase {

    @Test
    public void shouldFillFormWithSuccess(){
        driver.get("http://seleniumui.moderntester.pl/form.php");

        WebElement firstNameInput= driver.findElement(By.cssSelector("#inputFirstName3"));
        firstNameInput.sendKeys("Jan");
        driver.findElement(By.cssSelector("#inputLastName3")).sendKeys("Kowalski");
        driver.findElement(By.cssSelector("#inputAge3")).sendKeys("30");
        driver.findElement(By.cssSelector("#inputEmail3")).sendKeys("asfafs@gmail.com");
        List<WebElement> genders = driver.findElements(By.cssSelector("[name='gridRadiosSex']"));
        genders.get(0).click();

        List<WebElement> experience = driver.findElements(By.cssSelector("[name='gridRadiosExperience']"));
        experience.get(1).click();

        List<WebElement> profession = driver.findElements(By.cssSelector("[name='gridCheckboxProfession']"));
        profession.get(1).click();

        Select dropdown = new Select(driver.findElement(By.id("selectContinents")));
        dropdown.selectByVisibleText("Africa");

        Select dropdown2 = new Select(driver.findElement(By.id("selectSeleniumCommands")));
        dropdown2.selectByIndex(2);






        driver.findElement(By.cssSelector("[type='submit']")).click();
        String result= driver.findElement(By.cssSelector("#validator-message")).getText();
        Assert.assertEquals(result,"Form send with success");

        try {
            // Sleep for 2 seconds
            Thread.sleep(2000);
            System.out.println("Thread slept for 2 seconds.");

        } catch (InterruptedException e) {
            // Handle the InterruptedException
            System.err.println("Thread was interrupted while sleeping.");
        }

    }











}