package Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFile {
	
	public static void main(String[] args) throws IOException {
		
		String excelfilepath= ".\\Datafiles\\country.xlsx";
		
		FileInputStream inputstream=new FileInputStream(excelfilepath);     // open file in reading mode
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		
//		XSSFSheet sheet =workbook.getSheet("Sheet1");    // we can also use sheet name or sheet index
		XSSFSheet sheet =workbook.getSheetAt(0);
		
		// Using for Loop 
		
		int rows=sheet.getLastRowNum();      // return the last row no.of the sheet
		int cols=sheet.getRow(1).getLastCellNum(); //  return the no. of colums in a particular row
	
	
	    for(int r=0;r<rows;r++) 
	    {
	    	XSSFRow row1=sheet.getRow(r);
	    	
	    	for(int c=0;c<cols;c++) 
	    	{
	    		XSSFCell cell=row1.getCell(c);
	    		
	    		switch (cell.getCellType())
	    		{
	    		case STRING: System.out.print(cell.getStringCellValue()); break;
	    		case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
	    		case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
	    		
	    		}
	    		System.out.print("  |  ");
	    	}
	    	System.out.println();
	    }
	
	}

}
