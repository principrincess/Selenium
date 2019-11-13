import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class PopupHandle {
    private WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.compliancekey.us/forgotPassword");
        driver.findElement(By.xpath("//*[@id=\"login_btn\"]")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();
        if (text.equals("Please Enter Email Id.")){
            System.out.println("Correct");
        }
        else {
            System.out.println("In-Correct");
        }
        alert.accept();

    }
}