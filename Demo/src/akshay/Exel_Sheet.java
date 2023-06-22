package akshay;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Exel_Sheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		
         FileInputStream j = new  FileInputStream("C:\\Parameterization\\Test.xlsx");
         String info = WorkbookFactory.create(j).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.println(info);


		
		
	}

}
