/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {
    private WebDriver driver;

    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            FileInputStream ip = new FileInputStream("C:\\Users\\CHANCHAL\\IdeaProjects\\selenium\\src\\main\\java\\config.properties");
            prop.load(ip);
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        String url = prop.getProperty("URL");

        System.out.println(prop.getProperty("Name"));
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
    }
}

*/
