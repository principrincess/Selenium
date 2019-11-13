package sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample {


    public static void main(String[] args) {


        //FirefoxDriver driver = new FirefoxDriver();
        //InternetExplorerDriver driver = new InternetExplorerDriver();
        //ChromeDriver driver = new ChromeDriver();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.atm-dmc.com");
		/*driver.click("Submit button");
		driver.sendKeys("Text Box", "trainer@way2automation.com");
*/
    }

}
