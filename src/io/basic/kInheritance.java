package io.basic;

public class kInheritance {
	
	
	// Inheritance is the concept of using parent class properties by child class
	// Properties includes methods and variables.
	
	String color = "White";
	
	public void engine() {
		System.out.println("Engine speed was 125cc");
	}
	
		public void breaks() {
		System.out.println("Ultra fast breaks without harm");
	}
		
		public void lights() {
		System.out.println("Big and strong head lights");
	}
		
	public static void main(String[] args) 
	{
		kInheritance ki = new kInheritance();
		ki.lights();
		System.out.println(ki.color);

  
	}

}
