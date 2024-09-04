package com.page;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileReader {

        @DataProvider(name = "validTest")
        public static Object[][] readValidExcelData() throws Exception {
            return readExcelDataByRowIndex(1);
        }

        @DataProvider(name = "invalidTest")
        public static Object[][] readInvalidExcelData() throws Exception {
            return readExcelDataByRowIndex(2);
        }

        private static Object[][] readExcelDataByRowIndex(int rowIndex) throws Exception {
            String filePath = "src/main/resources/test1.xlsx";
            FileInputStream fis = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            List<Object[]> data = new ArrayList<>();
            Row row = sheet.getRow(rowIndex);


            int userId = (int) row.getCell(0).getNumericCellValue();
            int password = (int) row.getCell(1).getNumericCellValue();
            String name = row.getCell(2).getStringCellValue();
            String address = row.getCell(3).getStringCellValue();
            int zipCode = (int) row.getCell(4).getNumericCellValue();
            String email = row.getCell(5).getStringCellValue();

            data.add(new Object[]{userId, password, name, address, zipCode, email});

            workbook.close();
            fis.close();

            return data.toArray(new Object[0][]);
        }
    }