package travelers.com.helpers;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class ExcelHelpers {

    public static Object [] [] readExcelFile (File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();
        String [] [] data = new String[rowNumbers][colNumbers];

        for(int i=0; i<rowNumbers; i++) {
            Row row = sheet.getRow(i+1);
            for (int j=0; j<row.getLastCellNum();j++){
                data [i] [j] = row.getCell(j).getStringCellValue();
            }
        }
        return data;


    }

    public static void main(String[] args) throws IOException {

        //Object [] [] data = ;
       // System.out.println(data [0] [1]);
    }
}
