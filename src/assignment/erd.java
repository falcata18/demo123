package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class erd {

	public static void main(String[] args) {
		
		
		
		
	
	ArrayList<product> al = new ArrayList<product>();
		
	ExcelReadMain m = new  ExcelReadMain("C:\\New folder (2)\\Selenium Project\\Collection Project\\src\\assignment\\TEST1.XLSX");
	System.out.println(m.getRowCount("Sheet1"));
	System.out.println(m.getCellCount("Sheet1"));
	//System.out.print(m.getexcatrow(2));
	//System.out.print(m.getexcatcell(2));
	//System.out.print();
	/*{
		//hint ID=(int)m.getCellCount("Sheet1");
	//	Srname = cell2.getStringCellValue();
		//number =(double)cell3.getNumericCellValue();
//		product p= new product()
		 
	
	//	al.add(p);
	}
	
	Iterator it = al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
		product p=(product)it.next();
		
	}
		String s=it.();
		System.out.println(s);
	}

}
*/
	}
}