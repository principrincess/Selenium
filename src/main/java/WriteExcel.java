import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        String excelFileName = "D:/Data/TestingData.xlsx";//name of excel file

        String sheetName = "Sheet2";//name of sheet

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("sheet2") ;

        //iterating r number of rows
        for (int r=0;r < 5; r++ )
        {
            XSSFRow row = sheet.createRow(r);

            //iterating c number of columns
            for (int c=0;c < 5; c++ )
            {
                XSSFCell cell = row.createCell(c);
                cell.setCellValue("Cell "+r+" "+c);
            }
        }
        FileOutputStream fileOut = new FileOutputStream("TestingData.xlsx");
        //write this workbook to an Outputstream.
        wb.write(fileOut);
        fileOut.flush();
        //fileOut.close();
    }
    }
