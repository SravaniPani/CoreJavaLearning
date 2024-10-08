// Set Interface implements  HashSet, TreeSet and LinkedHashSet Classes
// Set won't allow duplicate values
// There's is no concept of indexing by using set

package io.colconcept;

import java.util.HashSet;
import java.util.Iterator;

public class HasASecondProgram {
	
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("Sravani");
		h.add("Vijju");
		h.add("Sravani");
		h.add("Ani");
		System.out.println(h);
		h.remove("Vijju");
		System.out.println(h);
		
		// iterator is used to traverse each element into the set
		// generally we at frist element will be at top of the set, by using ".next()" we will iterate through one by one element in the set
		
		
		 Iterator<String> i = h.iterator();
		 //i.next();
		 System.out.println(i.next());
		 System.out.println(i.next());
		 
		 
		 h.add("Vijju2");
			System.out.println(h);

         //		 while(i.hasNext()) 
//			 
//		 { 
//			 System.out.println(i.next());
//		 } 
		 

	
		 





	}

}
