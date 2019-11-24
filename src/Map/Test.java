package Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(101, "abc");
		hm.put(102, "abcd");
		System.out.println(hm);
		hm.put(101, "xyz");// it overide abc to xyz
		System.out.println(hm);
		hm.put(103, "goh");
		System.out.println(hm.get(102));
		System.out.println(hm.get(104));
		Set<Integer>s=hm.keySet();
		System.out.println(s);
		Collection<String> l= hm.values();
		System.out.println(l);
		for(Map.Entry me:hm.entrySet())
		{
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
		
		
		
		
	}
	}


