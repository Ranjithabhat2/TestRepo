package Generic_FWK;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_read_excel {
	public static String get_data(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		String val="";
		try{
		FileInputStream fis=new FileInputStream("./Excel/Seleniumtestdata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Cell c=book.getSheet(sheet).getRow(row).getCell(cell);
		val=c.toString();
	}
	catch(Exception e)
	{
		System.out.println("data nt found");
	}
		return val;
		
		
	}
	

}
