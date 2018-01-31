import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelReadWrite {
	private static final String path = "C:\\Users\\soumya.billava\\Desktop\\Automation\\auto1.xls";
	public static void main(String args[]) throws  IOException, WriteException, BiffException
	{
		Workbook workbook = Workbook.getWorkbook(new File(path));
		WritableWorkbook copy = Workbook.createWorkbook(new File(path), workbook);
		
		WritableSheet sheet2 = copy.getSheet(1); 
		WritableCell cell = sheet2.getWritableCell(1, 1); 

		if (cell.getType() == CellType.LABEL) 
		{ 
		  Label l = (Label) cell; 
		  l.setString("modified cell"); 
		}
		copy.write(); 
		copy.close();
		workbook.close();
	}
}
