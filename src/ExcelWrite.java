import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class ExcelWrite {
	private static String FilePath = "C:\\Users\\soumya.billava\\Desktop\\Automation\\auto1.xls";
	public static void main(String args[]) throws BiffException, IOException, RowsExceededException, WriteException
	{
		
	//	FileInputStream fs = new FileInputStream(FilePath);
	//	Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
	//	Sheet sh = wb.getSheet(0);
		
		// To get the number of rows present in sheet
	//	int totalNoOfRows = sh.getRows();
	//	System.out.println("TOTAL IDs : "+totalNoOfRows);
		
		//Writing into excel
		   // Excel
	//	 Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\soumya.billava\\Desktop\\Automation\\auto1.xls"));
		 WritableWorkbook book = Workbook.createWorkbook(new File(FilePath));
		 
	//	 WritableSheet contact = book.getSheet("Contact");	
	//	 WritableSheet jobs = book.getSheet("Jobs");	
	//	 WritableSheet education = book.getSheet("Education");	
	//	 WritableSheet skills = book.getSheet("Skills");
		 
		 /* LinkedIn ID
		 
		Label label= new Label(0, 1, contactid);
		contact.addCell(label);
		*/
		 
		  WritableSheet excelSheet = book.createSheet("Sheet 1", 0);

          // add something into the Excel sheet
          Label label = new Label(0, 0, "Test Count");
          excelSheet.addCell(label);

      //    Number number = new Number(0, 1, 1);
       //   excelSheet.addCell(number);

          label = new Label(1, 0, "Result");
          excelSheet.addCell(label);

          label = new Label(1, 1, "Passed");
          excelSheet.addCell(label);

      //    number = new Number(0, 2, 2);
      //    excelSheet.addCell(number);

          label = new Label(1, 2, "Passed 2");
          excelSheet.addCell(label);

          book.write();
          
          book.close();
          System.out.println("done");
	}
}
