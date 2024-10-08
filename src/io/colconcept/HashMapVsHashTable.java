package io.colconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapVsHashTable {

	public static void main(String[] args) {
		
		HashMap<Integer , String> hp = new HashMap<Integer , String>();
		hp.put(0, "Vijju");
		hp.put(1, "Vijju2");
		hp.put(2, "Vijju3");
		System.out.println(hp.get(1));
		hp.remove(1, "Vijju2");
		System.out.println(hp.get(1));
		Set sp= hp.entrySet();
		Iterator i = sp.iterator();
		 while(i.hasNext()) {
			 Map.Entry mp=(Map.Entry)i.next();
			 System.out.println(mp.getKey());
			 System.out.println(mp.getValue());
		 }

	}

}
