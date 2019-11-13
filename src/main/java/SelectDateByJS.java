/*
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SelectDateByJS {
    private WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");
        String dateVal = "28-10-2019";
        WebElement date = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input")).;
    }
    public static void SelectDateByJS(WebDriver driver, WebElement element, String dateVal){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("argument[0].setAttribute('value','"+dateVal+"');",element);
    }
}*/

