import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class HtmlUnitDriverConcept {
    private WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");


      //WebDriver driver = new FirefoxDriver();

    WebDriver driver = new HtmlUnitDriver(true);
        ((HtmlUnitDriver) driver).setJavascriptEnabled(true);
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ijonaskills.us/login");
        System.out.println("Before login, title is " + driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"email_id\"]")).sendKeys("mdeepa@ijonaservices.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"login_btn\"]")).click();

        Thread.sleep(10000);
       // WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/div[2]/a")));
        System.out.println(driver.getTitle());

    }
}
