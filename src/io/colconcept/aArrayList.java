// Collections is a framework which contains classes and interfaces to maintain code easily as well as it gives extra features
// We need to import anything related to collections from java.util package.
// List is an interface it implements classes like ArrayList, LinkedList and Vector.
// List allows duplicate values.
// List follows indexing.
//

package io.colconcept;

import java.util.ArrayList;

public class aArrayList {

	public static void main(String[] args) {

		// Declaring with generic type
		ArrayList<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		a.add("apple");
		System.out.println(a);
		a.remove("apple");
		System.out.println(a);
		if (a.contains("orange")) {
			System.out.println("orange is found");
		} else {
			System.out.println("orange is not found");

		}
		System.out.println(a.size());

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		// By using for each loop
		System.out.println("----****By using for each loop****----");

		for (String arrayList : a) {
			System.out.println(arrayList);

		}

	}

}
