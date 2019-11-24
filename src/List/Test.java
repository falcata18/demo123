package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
	
		ArrayList al= new ArrayList();
		al.add("Selenium");
		al.add(10);
		System.out.println(al);
		System.out.println(al.size());
		al.add(0, 20.5);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.size());
		al.remove("Selenium");
		System.out.println(al);
		System.out.println(al.contains(10));
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}



