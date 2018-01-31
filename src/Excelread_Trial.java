import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelread_Trial {
	private static final String path = "C:\\Users\\soumya.billava\\Desktop\\Automation\\Sentrifugo_credential.xls";
	
	public static void main(String args[])
	{
	}
	
	public Sheet excel() throws BiffException, IOException{
		FileInputStream fs = new FileInputStream(path);
		Workbook wb = Workbook.getWorkbook(fs);
		final Sheet sheet = wb.getSheet(0);

		System.out.println("Total number of employees:"+ (sheet.getRows()-1));
		
		for(int i=1;i<sheet.getRows();i++)
		{
			Cell cell1 = sheet.getCell(0, i);
	        System.out.print(cell1.getContents() + "\n");   
	        Cell cell2 = sheet.getCell(1, i);
	        System.out.println(cell2.getContents()); 
		}

		/*
		Cell cell1 = sheet.getCell(0, 1);
        System.out.print(cell1.getContents() + "\n");   
        Cell cell2 = sheet.getCell(1, 1);
        System.out.println(cell2.getContents()); 
         
        Cell cell3 = sheet.getCell(0, 2);
        System.out.print(cell3.getContents() + "\n");    
        Cell cell4 = sheet.getCell(1, 2);
        System.out.println(cell4.getContents()); 
         */
        wb.close();
		return sheet;
		
	}
	public void read() throws BiffException, IOException {
		Sheet sheet = excel();
		
		System.out.println("Total number of employees:"+ (sheet.getRows()-1));
	}

}
