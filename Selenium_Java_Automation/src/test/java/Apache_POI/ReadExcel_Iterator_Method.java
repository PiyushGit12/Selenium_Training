package Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Iterator_Method {

	public static void main(String[] args) throws IOException {

		String excelfilepath = ".\\Datafiles\\country.xlsx";

		FileInputStream inputstream = new FileInputStream(excelfilepath); // open file in reading mode

		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);

//		XSSFSheet sheet =workbook.getSheet("Sheet1");    // we can also use sheet name or sheet index
		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator iterator = sheet.iterator(); // return all rows

		while (iterator.hasNext())
		{
			XSSFRow row = (XSSFRow) iterator.next();

			Iterator cellIterator = row.cellIterator();

			while (cellIterator.hasNext())
			{
				XSSFCell cell = (XSSFCell) cellIterator.next(); /// Return the cells

				switch (cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}

				System.out.println("  |   ");
			}

			System.out.println();
		}
	}
}
