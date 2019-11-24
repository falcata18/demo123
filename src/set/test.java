/*			HASHSET
 * HASH SET NOT ALLOW THE DUPLICATE ELEMENT(record) 
 * HASHSET OUTPUT IS NOT GET PROPERLY OUTPUT IT MEANS SEQUANCE IS NOT PROPER
 * 

*/
package set;

import java.util.HashSet;
import java.util.Iterator;

import javax.print.attribute.HashAttributeSet;

public class test {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(123);
		hs.add("hello");
		hs.add(56.7);
		System.out.println(hs);
		
		hs.add(34);
		System.out.println(hs);
		hs.add(123);// not provide duplicate element 
		System.out.println(hs);
		System.out.println(hs.contains(123));// it provide element avalible or not
		hs.remove(34);
		System.out.println(hs);
		
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		
		
	}
	

}
