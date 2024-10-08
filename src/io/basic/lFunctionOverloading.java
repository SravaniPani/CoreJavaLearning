package io.basic;

public class lFunctionOverloading  {
	
	// In method overloading method names will be same. But the no of arguments or argument type should be different.
	
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		lFunctionOverloading fol = new lFunctionOverloading();
		fol.getData("Hi");
		fol.getData(10);


	}

}
