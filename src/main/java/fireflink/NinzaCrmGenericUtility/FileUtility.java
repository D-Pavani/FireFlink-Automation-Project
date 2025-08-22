package fireflink.NinzaCrmGenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.security.sasl.AuthorizeCallback;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of generic methods related to 
 * Read the data from the external files like property file,excel file
 * @author Dammavalam Pavani
 */

public class FileUtility {

	
	/**
	 * This method is read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */	
	public String readDataFromPropertyFlie(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p= new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	
	
	/**
	 * This method is read the data from Excel file
	 *  and return that data to caller 
	 * @param SheetName
	 * @param rowNo
	 * @param cellNo
	 * @throws IOException 
	 * @throws EncryptedDocumentException  
	 */	
	public String readDataFromExcelFlie(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TestData1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		
	}
	
//	public Object[][] dataProvider(String sheetName) throws EncryptedDocumentException, IOException
//	{
//		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TestData1.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet s = wb.getSheet(sheetName);
//		
//		Object[][] data=new Object[rows][cols];
//		for(int j=0;j<rows;j++)
//		{
//			for(int i=0;i<cols;i++)
//			{
//				data[j][i]=readDataFromExcelFlie( sheetName, , cellNo);
//			}
//			
//			
//		}
//		data[0][0]=read;
//		data[0][1]="abc";
//		data[1][0]=1;
//		data[1][1]="abc";
//		data[2][0]=1;
//		data[2][1]="abc";
//		data[3][0]=1;
//		data[3][1]="abc";
//		return null;
//		
//	}
//	

	
}
