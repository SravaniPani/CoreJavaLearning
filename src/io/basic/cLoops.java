package io.basic;

public class cLoops {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 90;
		arr[2] = 11;
		arr[3] = 17;
		arr[4] = 14;

		System.out.println(arr[4]);
		// for loop concept.

		// array index starts at 0, so we will use 0 to initialize.
		// <= is also not correct, it will throw a error.
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

		System.out.println("----------------------------------------------");

		// String arrays.
		String[] namesList = { "Sravani", "Pani", "Java" };
		for (int i = 0; i < namesList.length; i++) {
			System.out.println(namesList[i]);
		}

		System.out.println("-------------------------------");

		// Enhanced for loop.

		for (String n : namesList) {
			System.out.println(n);
		}
	}

}
