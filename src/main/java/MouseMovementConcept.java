
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseMovementConcept{
    private WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.compliancekey.us/");
        Actions action =new Actions (driver);
        action.moveToElement(driver.findElement(By.linkText("Industries"))).build().perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/ol/li[1]/a")).click();
    }
}
