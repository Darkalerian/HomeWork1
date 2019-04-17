package homeworkqaauto.utils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDataStorage {
    private static Workbook excelBook;
    private static Sheet excelSheet;
    private static Cell excelCell;
    private static Row excelRow;


    public static void SetExcelFile(String path, String sheetName){

        try {
            FileInputStream excelFile = new FileInputStream(path);

            excelBook = new HSSFWorkbook(excelFile);
            excelSheet = excelBook.getSheet(sheetName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCellData(int rowNum, int colNum){

        try {
            excelCell = excelSheet.getRow(rowNum).getCell(colNum);
            String cellData = excelCell.getStringCellValue();
            return cellData;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void setCellData(String result, int rowNum, int colNum){
        try {
            excelRow = excelSheet.getRow(rowNum);
            excelCell = excelRow.getCell(colNum, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

            if (excelCell == null){
                excelCell = excelRow.createCell(colNum);
                excelCell.setCellValue(result);
            } else {
                excelCell.setCellValue(result);
            }

            FileOutputStream fileOut = new FileOutputStream(Constant.PATH_TEST_DATA+Constant.FILENAME_TEST_DATA);
            excelBook.write(fileOut);
            fileOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
