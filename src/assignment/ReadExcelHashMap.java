package assignment;

import java.util.HashMap;

public class ReadExcelHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer>hm= new HashMap<String,Integer>();
		ExcelReadMain m= new ExcelReadMain("C:\\New folder (2)\\Selenium Project\\Collection Project\\src\\assignment\\username&Pass.xlsx");	
		m.getCellCount("Sheet1");
		
		//System.out.println(hm.put("naval", 555));
		
		
		
		
	}

}
