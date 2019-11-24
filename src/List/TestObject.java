package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


	
		
		class Product{
			private int id;
			private String name;
			private double price;
			public Product(int id, String name, double price) {
				super();
				this.id = id;
				this.name = name;
				this.price = price;
			}
			public void Displayproduct()
			{
				System.out.println(id+" "+name+" "+price);
			}
			
		}
		

public class TestObject {

		public static void main(String[] args) {
			
		ArrayList<Product> al =new ArrayList<Product>();
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double price;
		
		for(int i=0;i<3;i++)
		{
			System.out.println(" Enter data");
			id=sc.nextInt();
			name=sc.next();
			price=sc.nextDouble();
			Product P= new Product(id,name,price);
			al.add(P);
			
		}
		
		System.out.println("product details are");
		/*for(Product P:al)
		{
		     P.Displayproduct();
		}*/
		
		Iterator<Product> it = al.iterator();
				while(it.hasNext())
				{
					Product P=(Product)it.next();
					P.Displayproduct();
				}

}
		
}