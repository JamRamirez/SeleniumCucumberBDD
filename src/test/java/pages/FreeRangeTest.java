package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;;


public class FreeRangeTest {
    
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navegamosFreeRangeTesters() {
        driver.get("https://www.freerangetesters.com/");
    }

    @AfterMethod
    public void terDown(){
        if (driver != null){
            driver.quit();
        }
    }

}
