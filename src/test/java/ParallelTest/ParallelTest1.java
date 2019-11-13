
//we have to create xml file for parallel run the test case



package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;

    @Test
            void logotest() {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ijonaacademy.com/");
        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/div/a/img"));
        Assert.assertTrue(logo.isDisplayed());

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void titletest()
    {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ijonaacademy.com/");
        System.out.println(driver.getTitle());
    }
}
