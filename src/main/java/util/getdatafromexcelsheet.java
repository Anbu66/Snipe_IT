package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getdatafromexcelsheet {

	public static Object[][] getdata(String sheetname)
			throws FileNotFoundException, InvalidFormatException, IOException {

		File loc = new File("D:\\Eclipse\\Complete\\Snipeitapp\\TestData\\SnipeitTestData.xlsx");
		FileInputStream str = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(str);
		Sheet s = w.getSheet(sheetname);
		Object[][] data = new String[s.getLastRowNum()][s.getRow(0).getLastCellNum()];
		for (int i = 0; i < s.getLastRowNum(); i++) {
			for (int j = 0; j < s.getRow(0).getLastCellNum(); j++) {
				int type = s.getRow(i + 1).getCell(j).getCellType();
				{
					if (type == 1) {
						String anbu = s.getRow(i + 1).getCell(j).getStringCellValue();
						data[i][j] = s.getRow(i + 1).getCell(j).toString().valueOf(anbu);
					}

					else {
						double d = s.getRow(i + 1).getCell(j).getNumericCellValue();
						long l = (long) d;
						String name = String.valueOf(l);
						data[i][j] = s.getRow(i + 1).getCell(j).toString().valueOf(name);
					}

				}

			}

		}
		return data;
	}
}
