package io.basic;

public class aDataTypeAndVariables {

	public static void main(String[] args) {
		
		int age = 10;
		float b = 10;
		double d = 10.99;
		char c = 'S';
		boolean condition= true;
		
		// Above all are primitive data types
		// they starts with small letter
		// The size depends on the type of the data structure.
		// Primitive data structure is a kind of data structure that stores the data of only one type
		
		
		// Non Primitive data types
		
		//Examples are Strings, Arrays, Class, Object and some data structures like ArrayList, HashMap etc..
		// We have to declare them with Capital letter
		// Non-primitive data structure is a type of data structure that can store the data of more than one type.
		// Size is not fixed
		
		String name="Sravani";
		
		//Array - it's a primitive data type used to store more than one value.
		
		//1. Declaration 1
		int [] arr = new int[5];
		arr[0] =1;
		arr[1] =90;
		arr[2] =11;
		arr[3] =17;
		arr[4] =11;
//		arr[5] =11;
		//System.out.println(arr[5]+ "arrayValue"); -- error
		System.out.println(arr[1]+" 2nd value in the array");
		
		//Declaration 2
		
		int [] arr1 = {10,11,12,4};
		System.out.println(arr1[2]+" 3rd value in the arraty 2");
		
		int [] arr2 = {10,11,12,4};
		System.out.println(arr2[2]+" 3rd value in the arraty 2");


		

		
						
		// Some operations
		System.out.println(age);
		System.out.println("My age is"+ ":"+age);
		
	}

}
