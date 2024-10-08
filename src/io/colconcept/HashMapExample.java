package io.colconcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		// Hashtable is synchronized, where as HashMap is not syncronized
		// Hashtable doesn't allow null values, where as HashMap is allows one null key and any no of null values
		// HashMap objects are iterated through iterator, where as Hashtable uses enuemarator to interate HashTable object.

		
		Hashtable<Integer , String> hp = new Hashtable<Integer , String>();
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
			 System.out.println("Hiiii");
		 }

	}

}
