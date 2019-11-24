package List;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Ramesh");
		al.add("Rakesh");
		al.add("Suresh");
		al.add("Mahesh");

		System.out.println(al);
		al.add(1,"Adi");
		System.out.println(al);
		System.out.println(al.get(3));
		al.set(1, "Prakash");
		System.out.println(al);
	    System.out.println( al.contains("Prakash"));
	    ArrayList<String> al1= new ArrayList<String>();
	    al1.add("Atul");
	    al1.addAll(al);
	    System.out.println(al1);
	    System.out.println();
	    Iterator<String>it=al1.iterator();
	  /*  while(it.hasNext())
	    {
	    	System.out.println(it.next()+"\t");
	    }
	*/
	for(String s:al1)
	{
		System.out.println(s);
	}
	
	
	
	
	}

}


