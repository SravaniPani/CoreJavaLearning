package io.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dArrayLists {

	public static void main(String[] args) {
		// Array list we can add the values dynamically, that's the biggest advantage
		ArrayList<String> a = new ArrayList<String>(); // normal declaration
		a.add("Seetha");
		a.add("Geetha");
		a.add("Sheela");
		a.add("Maala");
		System.out.println(a.get(3));
		System.out.println("********************");

		// And the difference is in Array we will use length() in ArrayList we will use
		// size()

		
		

		// using enhanced for loop

		for (String values : a) {
			System.out.println(values);

		}
		
		System.out.println("********************");


		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		

		System.out.println("********************");

		// some useful methods also there compare to Array's in ArrayList. which will be
		// advanced features

		System.out.println(a.contains("Sheela"));

		System.out.println("********************");

		// we can convert normal string as list

		String[] personNames = { "Santhi", "Branthi", "Kranthi" };
		List<String> personNamesNew = Arrays.asList(personNames);
		System.out.println(personNamesNew.contains("vijju"));

	}

}
