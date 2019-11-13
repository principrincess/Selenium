import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import  org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotConcept {
    private WebDriver driver;
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\CHANCHAL\\IdeaProjects\\selenium\\google.png"));

    }
}
