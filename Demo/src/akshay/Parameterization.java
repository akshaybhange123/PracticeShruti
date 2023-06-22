package akshay;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.io.FileHandler;

public class Parameterization 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException 
  {
	FileInputStream Fn  = new FileInputStream("C:\\Parameterization\\Test.xlsx");  
	Sheet File =WorkbookFactory.create(Fn).getSheet("Sheet1");
	  System.out.println(File);
	  int row = File.getLastRowNum();
	  System.out.println("Total No of row=" +row);
	  
	  short cell = File.getRow(row).getLastCellNum();
	  System.out.println("Total No of cell="+cell);
	  
	  for(int i=0; i<=row; i++) 
	  {
		  String f1 = File.getRow(i).getCell(0).getStringCellValue()+" "+File.getRow(i).getCell(1).getStringCellValue()+" "
	     +File.getRow(i).getCell(2).getStringCellValue()+" "+File.getRow(i).getCell(3).getStringCellValue();
		  System.out.println(f1);
	  }
	  
	  
	  
	  
	
  }
	
}
