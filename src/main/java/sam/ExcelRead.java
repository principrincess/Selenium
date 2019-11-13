package sam;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;

public class ExcelRead {
    private WebDriver driver;

    public static void main(String [] args) {

        XSSFWorkbook ExcelWBook;
        XSSFSheet ExcelWSheet;
        XSSFCell Cell;

        // Location of the Excel file
        String path ="C:\\Users\\CHANCHAL\\IdeaProjects\\selenium\\src\\main\\java\\sam";
        String sheetName = "Sheet1";

        try {
            FileInputStream ExcelFile = new FileInputStream(path);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(sheetName);

            Cell = ExcelWSheet.getRow(1).getCell(2);
            String cellData = Cell.getStringCellValue();
            System.out.println("Cell Data: " + cellData);

        } catch (Exception e) {
            e.printStackTrace();
        }


        /*System.setProperty("webdriver.gecko.driver", "C:/Webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");*/
    }
}
