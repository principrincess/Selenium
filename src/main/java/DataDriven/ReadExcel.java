package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ReadExcel {

    public static void main(String[] args) throws IOException {

        InputStream src = new FileInputStream("D:/Data/TestingData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(src);

        XSSFWorkbook test = new XSSFWorkbook();

        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row;
        XSSFCell cell;

        Iterator rows = sheet.rowIterator();

        while (rows.hasNext()) {
            row = (XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext()) {
                cell = (XSSFCell) cells.next();
//
//                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
//                    System.out.print(cell.getStringCellValue() + " ");
//                } else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
//                    System.out.print(cell.getNumericCellValue() + " ");
//                } else {
//                    //U Can Handel Boolean, Formula, Errors
//                }
            }
            System.out.println();
        }

    }

}
