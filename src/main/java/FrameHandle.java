
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandle {
    private WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");
    }
}
