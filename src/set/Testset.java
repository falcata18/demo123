/*
  example of homoginious data using hashset
  example of tree set
  tree set provide data to shorted order
*/

package set;

import java.util.HashSet;
import java.util.TreeSet;

public class Testset {

	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("abc");
		hs.add(" DBC");
		hs.add("GJG");
		hs.add("ASH");
	 System.out.println(hs);
	 TreeSet<String> ts= new TreeSet<String>();
	 
	 	ts.add("ABX"); // tree set provide data to shorted order
		ts.add("DBC");
		ts.add("GJG");
		ts.add("ASH");
		System.out.println(ts);
	 
	}
}
