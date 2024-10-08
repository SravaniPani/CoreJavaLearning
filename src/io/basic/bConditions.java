package io.basic;

public class bConditions {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 17, 40, 90 };
		int[] arr1 = { 1, 2, 17, 40, 90 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);

			}

		}

		System.out.println("--------------------");

		for (int i = 0; i < arr.length; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.println(arr[i] + " is multiple of 2 ");

			} else {
				System.out.println(arr1[i] + " it's not multiple of 2");
			}
		}

		System.out.println("--------------------");

		for (int i = 0; i < arr.length; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.println(arr[i] + " is multiple of 2 ");
				break;
			} else {
				System.out.println(arr1[i] + " it's not multiple of 2");
			}
		}

	}

}
