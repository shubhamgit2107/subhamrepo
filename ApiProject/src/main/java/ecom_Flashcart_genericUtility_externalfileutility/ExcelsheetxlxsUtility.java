package ecom_Flashcart_genericUtility_externalfileutility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelsheetxlxsUtility {
	private DataFormatter df;
	private Workbook wb;
	/**
	 * 
	 */
	@Deprecated
	public ExcelsheetxlxsUtility() {}
	/**
	 * 
	 * @param excelxlxspath
	 * @param expTestscriptName
	 * @param expkey
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public ExcelsheetxlxsUtility(String filepath) throws EncryptedDocumentException, IOException
	{
		/**
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 * @param filepath
		 * @author shubh
		 */
		intillizeExcel(filepath);
	}
	
	public Map<String, String> initializeExcel(String expTestCaseName,String sheetname) throws EncryptedDocumentException, IOException 
	{
		/**
		 * 
		 * @param expTestCaseName
		 * @param sheetname
		 * @author shubh
		 * tofetch multiple data from excelsheet
		 * Bt using hashmap
		 */
		
	
Sheet sheet = wb.getSheet(sheetname);
int rowcount = sheet.getLastRowNum();
System.out.println(rowcount);
Map<String,String>map=new HashedMap<>();
for(int i=0;i<=rowcount;i++)
{
	String testcasename=df.formatCellValue(sheet.getRow(i).getCell(0));
	if(testcasename.equals(expTestCaseName))
	{
		for(int j=1;j<=sheet.getRow(i).getLastCellNum();j++)
		{
			String key=df.formatCellValue(sheet.getRow(i).getCell(j));
			String value=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			map.put(key, value);
		}
		break;
	}
	
	
}
return map;

	
	}
	
		

	public String getData(String excelsheet,String expTestscriptName,String expkey) throws EncryptedDocumentException, IOException
	{
		/**
		 * @param excelsheet 
		 * @param expTestscriptNmae
		 * @param expKey
		 * @author shubh
		 * tofetch the data from excelsheet
		 */
		
Sheet sheet = wb.getSheet(excelsheet);
int rowcount = sheet.getLastRowNum();
System.out.println(rowcount);
int testScriptCounter=0;
int keyCounter=0;
String value="";
for(int i=1;i<=rowcount;i++)
{
	String testscriptname=df.formatCellValue(sheet.getRow(i).getCell(0));
	if(testscriptname.equals(expTestscriptName))
	{
		testScriptCounter++;
		for(int j=1;j<=sheet.getRow(i).getLastCellNum();j++)
		{
			String key=df.formatCellValue(sheet.getRow(i).getCell(j));
			if(key.equals(expkey))
			{
				keyCounter++;
				df.formatCellValue(sheet.getRow(i+1).getCell(j));
				break;
			}
			
		}
		break;
	}
	
	
}
if(keyCounter==0)
{
	if(testScriptCounter==0)
	{
	value="enter proper test scriptkey"+expTestscriptName+"";	
	}
	else
	{
		value="enter proper test scriptkey"+expkey+"";	
	}
	
}
System.out.println("value fatch forexcelsheet  ==>"+value);
	return value;
	}
	
	
	public String[][] getDataProvider(String sheetname)
	{
		Sheet sheet = wb.getSheet(sheetname );
		int rowcount = sheet.getLastRowNum();
		String[][] arr= new String[rowcount][sheet.getRow(0).getLastCellNum()];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				arr[i-1][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return arr;
	}
	public void intillizeExcel(String filepath) throws EncryptedDocumentException, IOException
	{
	 df=new DataFormatter();
	FileInputStream fisex=new FileInputStream(filepath);
	wb=WorkbookFactory.create(fisex);
	fisex.close();
	}
	public String getData(String sheetname,int rowindex,int cellindex)
	{
		String value = df.formatCellValue(wb.getSheet(sheetname).getRow(rowindex).getCell(cellindex));
		return value;
	}
	public void close() throws IOException
	{
		wb.close();
	}
	public void setData(String sheetname,int rowindex,int cellindex)
	{
	wb.getSheet(sheetname).getRow(rowindex).getCell(cellindex)	;
	}
	public void saveData(String fileoutputpath) throws FileNotFoundException, IOException
	{
		wb.write(new FileOutputStream(fileoutputpath));
	}
	
	
	
	
	
	

}

