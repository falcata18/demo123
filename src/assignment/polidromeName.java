package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class polidromeName {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		//Scanner sc =new Scanner(System.in);
		al.add("Ramesh");
		al.add("Rakesh");
		al.add("Suresh");
		al.add("Mahesh");
		al.add("NamaN");
		al.add("Lalla");
		al.add("LAAL");
		System.out.println(al);
		for(String s:al)
		{
			StringBuffer sb= new StringBuffer(s);
			sb.reverse();
			String s1=sb.toString();
			
			if(s.equals(s1))
			{
				System.out.println("Polidrome name :"+s);
			}
			
			
		}
		
		
	}

}
