
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Navigation {
    private WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
