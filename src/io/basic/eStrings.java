package io.basic;

public class eStrings {
	public static void main(String[] args) {
		
		//String is a object which represents group of characters.
		
		String s = "Sravani";
		String s2 = "Sravani";
		//Both will share same memory.. named as String literal
		
		String s3 = new String("Pani");
		String s4 = new String("Pani");
		//It will share different memory.. because we created it as objects
		
		System.out.println(s4);
		System.out.println(s2);
		
		System.out.println("***************");

		
	for(int i=0;i<s3.length(); i++) {
		System.out.println(s3.charAt(i));
	}
	
	System.out.println("***************");

	
	// Printing in reverse order
	for(int i=s3.length()-1;i>=0; i--) {
		System.out.println(s3.charAt(i));
	}
	
	System.out.println("***************");

	
	
	String name ="  Sravani Pani";
	String [] splittedString = name.split("Pani");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[0].trim());

	


		

	}

}
