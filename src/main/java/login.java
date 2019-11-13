//package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class login {
    private WebDriver driver;

    public static void main(String [] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");

        // Find departing field
//        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input")).click();
      //  Thread.sleep(3000);
        // Find the date to be selected
//        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr[1]/td[4]/a")).click();

        /*String departureDate = "28-10-2019";
        String departureQuery = "document.querySelector(\"input[placeholder='Journey Date(dd-mm-yyyy)*']\").value = '" + departureDate + "' ";
        System.out.println(departureQuery);
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript(departureQuery);
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }*/


    }
}