package assignment;

public class passfile {

	public static void main(String[] args) {
		
		ExcelReadMain m= new ExcelReadMain("C:\\New folder (2)\\Selenium Project\\Collection Project\\src\\assignment\\TEST1.XLSX");
		System.out.print(m.getCellCount("Sheet1"));
		System.out.print(m.getRowCount("Sheet1"));
		
		
		
	}

}
