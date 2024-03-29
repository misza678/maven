package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;



    @BeforeMethod
            public void setup(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("start-maximized");
         driver = new ChromeDriver(options);
    }


@AfterMethod
    public void clean(){
        driver.quit();
}



}