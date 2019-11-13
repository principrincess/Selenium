/*

public class App<TimeOut> {
    private static WebDriver WebDriveReference;
    private static  int TimeOut;
    public static class HandlingDate{
        static int targetDay = 0,
                targetMonth = 0,
                targetYear = 0;

        static int currentDay = 0,
                currentMonth = 0,
                currentYear = 0;

        static int jumpMonthsBy=0;

        static boolean increment = true;

    }

    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // And now use this to visit Google
//        driver.get("http://www.google.com");

        driver.get("https://www.atm-dmc.com");
        driver.findElement(By.xpath("//*[@id=\"agent_code\"]")).sendKeys("CA19151");
        driver.findElement(By.xpath("//*[@id=\"agent_username\"]")).sendKeys("Princi");
        driver.findElement(By.xpath("//*[@id=\"agent_password\"]")).sendKeys("1234");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/input[4]")).click();

        //wait for the page loading
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a")));

        //open next page
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a")).click();


        */
/*class accessDropDown {
            Select drpCountry = new Select(driver.findElement(By.name("search_country_code")));
        }*//*

        //select country
        Select countrySelect = new Select(driver.findElement(By.xpath("//*[@id=\"search_country_code\"]")));
        countrySelect.getOptions();
        countrySelect.selectByVisibleText("Thailand");

        //select city
        Select citySelect = new Select(driver.findElement(By.xpath("//*[@id=\"search_city\"]")));
        citySelect.getOptions();
        citySelect.selectByVisibleText("Bangkok");

        //select nationality
        Select nSelect = new Select(driver.findElement(By.xpath("//*[@id=\"guest_country\"]")));
        nSelect.getOptions();
        nSelect.selectByVisibleText("Indian");

        //select date
        String dateToSet = "14/01/2015";
        //get current date
        public static void getCurrentDateMonthAndYear();

        int currentDay = 0;
        int currentMonth = 0;
        int currentYear = 0;
        System.out.println(currentDay + "   " + currentMonth + "   " + currentYear);

       */
/* Select select = new Select(((FirefoxDriver) driver).findElementByXPath("/html/body/div[3]/div/div/div/div/div/div[2]/form/ul[1]/li[1]/select/option[218]"));
        select.selectByVisibleText("Thailand");*//*



        //WebDriverWait wait=new WebDriverWait(WebDriveReference, Clock.tickSeconds(TimeOut.));
//            }
//        });
    }

    public static void getCurrentDateMonthAndYear() {
    }

}
*/




/////////////////////


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;


public class App {


    static int targetDay = 0,
            targetMonth = 0,
            targetYear = 0;

    static int currentDay = 0,
            currentMonth = 0,
            currentYear = 0;

    static int jumpMonthsBy=0;

    static boolean increment = true;


    public static void main(String[] args) throws InterruptedException {
        /*
         *
         * target day, month, year
         * current day, month, year
         * jump to the monthk
         * increment or decrement
         */


        String dateToSet= "14/01/2015";

        //get current date
        getCurrentDateMonthAndYear();
        System.out.println(currentDay+"   "+currentMonth+"   "+currentYear);

        //get target date
        GetTargetDateMonthAndYear(dateToSet);
        System.out.println(targetDay+"   "+targetMonth+"   "+targetYear);


        //Get Jump month
        CalculateHowManyMonthsToJump();
        System.out.println(jumpMonthsBy);
        System.out.println(increment);


        WebDriver driver = new FirefoxDriver();
        driver.get("http://qa.way2automation.com/datepicker/defult1.html");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='datepicker']")).click();



        for(int i=0; i<jumpMonthsBy;i++){

            if(increment){

                driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();

            }else{

                driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]")).click();

            }

            Thread.sleep(1000);

        }
        driver.findElement(By.linkText(Integer.toString(targetDay))).click();

    }

    public static void getCurrentDateMonthAndYear(){

        Calendar cal = Calendar.getInstance();

        currentDay = cal.get(Calendar.DAY_OF_MONTH);
        currentMonth = cal.get(Calendar.MONTH)+1;
        currentYear = cal.get(Calendar.YEAR);

    }
    public static void GetTargetDateMonthAndYear(String dateString)
    {


        int firstIndex = dateString.indexOf("/");
        int lastIndex = dateString.lastIndexOf("/");

        String day = dateString.substring(0, firstIndex);
        targetDay = Integer.parseInt(day);


        String month = dateString.substring(firstIndex+1, lastIndex);
        targetMonth = Integer.parseInt(month);


        String year = dateString.substring(lastIndex+1, dateString.length());
        targetYear = Integer.parseInt(year);

    }


    public static void CalculateHowManyMonthsToJump(){

        if((targetMonth-currentMonth)>0){

            jumpMonthsBy = (targetMonth-currentMonth);
        }else{

            jumpMonthsBy = (currentMonth-targetMonth);
            increment = false;
        }


    }

}
