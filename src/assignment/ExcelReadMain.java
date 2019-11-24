//package ExcelReadMain;

//package Test;
package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 public class ExcelReadMain {
	
	Workbook book=null;
//	public ExcelReadMain(){}

	public ExcelReadMain(String filename) {
		File f= new File(filename);
		try{
		
		FileInputStream fis = new FileInputStream(f);
		book = WorkbookFactory.create(fis);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
		int getRowCount(String sheetname)
		{ 	int count=0;
		Sheet sheet= book.getSheet(sheetname);
		  for(Row row:sheet)
		  {
			  for(int i =0;i<=row.getHeight();i++)
			  {
				
				  Cell cell= row.getCell(i);
				  CellType type = cell.getCellTypeEnum();	
					 if (type == CellType.STRING)
						
							 
		 			 {
						 String s=cell.getStringCellValue();
						  System.out.print(" "+s);
					 }
					 else if (type == CellType.NUMERIC)
					 {
						 double s=cell.getNumericCellValue();
						 System.out.print(" "+s);
						
					 }
					
		 }
			
			  count++;
		  }
		return count;
		}
		
		int getCellCount(String sheetname)
		{ 	
			Sheet sheet= book.getSheet(sheetname);
			int count=0;

			for(Row row:sheet)
				for(Cell cell:row)
		     {  
					CellType type = cell.getCellTypeEnum();	
					 if (type == CellType.STRING)
						
							 
					 {
						 String s=cell.getStringCellValue();
						 System.out.println();
						  System.out.print(s);
					 }
					 else if (type == CellType.NUMERIC)
					 {
						 double s=cell.getNumericCellValue();
						 System.out.println();
						 System.out.print(" "+s);
						
					 }
					
						
		     }
			return count;
		}
		
	/*	 int getexcatrow(int rownum)
		 {	  //int count=0; 
			rownum=0;
		     Sheet sheet= book.getSheetAt(rownum);
			 Row row =sheet.getRow(rownum);
			 //Cell cell = row.getCell(rownum);
		
			return rownum; 
			
			 //return count;
		 }
		 int getexcatcell(int cellnum)
		 {	 int count=0;
		 Sheet sheet= book.getSheetAt(cellnum);
			 Row row =sheet.getRow(cellnum);
			 Cell cell = row.getCell(cellnum);
			 
			// String cellContents=cell.getNumericCellValue();
			 String cellContents = cell.getStringCellValue(); 
			 Double number=cell.getNumericCellValue();
			 System.out.println(cellContents);
			return cellnum;
*/		 }
	


