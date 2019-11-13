/*

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {
    private WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");
    }

    public static void flash(WebElement element, WebDriver driver) {
        JavaScriptExecutor js = ((JavaScriptExecutor) driver);
        String bgcolor = element.getCssValue("backgroundcolor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0, 200, 0)", element, driver);
            changeColor(bgcolor, element, driver);
        }
    }

    private static void changeColor(String color, WebElement element, WebDriver driver) {
        javascriptExecutor js = ((JavaScriptExecutor) driver);
        js.executeScript("argument[0].");
    }
}


                                          //INCOMPLETED*/
