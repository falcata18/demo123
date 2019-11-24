/* Read the file using collection object
arrylist<object>
*/

package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class product
{
	 private int id;
	 private String name;
	 private double number;
	 public void Displayproduct()
		{
			System.out.println(id+"  "+name+"  "+number);
		}
	public product(int id,String name,double number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}	
	
}



public class ReadData {

	public static void main(String[] args) throws Exception {
		
		
		int ID;
		String name;
		double number;
		
		ArrayList<product> al = new ArrayList<product>();
		
		 //ExcelReadMain m = new  ExcelReadMain("C:\\New folder (2)\\Selenium Project\\Collection Project\\src\\assignment\\TEST1.XLSX");
		
//	System.out.println(m.getRowCount("Sheet1"));
	//System.out.println(m.getCellCount("Sheet1"));
		 	File f= new File("C:\\New folder (2)\\Selenium Project\\Collection Project\\src\\assignment\\TEST1.XLSX");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet= book.getSheetAt(0);
		
		for(int i=1;i<=10;i++)
		{
			Row row1=sheet.getRow(i);
			Cell cell1= row1.getCell(0);
			Cell cell2= row1.getCell(1);
			Cell cell3= row1.getCell(2);
			//double s = cell1.getNumericCellValue();
			//System.out.print(s);
			
			//ID=(int)s;
			ID=(int)cell1.getNumericCellValue();
			name = cell2.getStringCellValue();
			number =(double)cell3.getNumericCellValue();
			product p= new product(ID,name,number);
			 
		
			al.add(p);
			
		}
		

		System.out.println("product details are");
	    for(product p:al)
		{
		     p.Displayproduct();
		}
	
		
	Iterator it = al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
		product p=(product)it.next();
		p.Displayproduct();
	}

		fis.close();

	}

	}
