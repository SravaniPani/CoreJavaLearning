package io.basic;

public class mConstructorExample {
	
	//Constructor will not return values
	//Constructor name should be same as class name
	//Whenever a object is created, constructor is the first thing to be get invoked/ executed first
	//If there is no constructor explicitly written than java compiler will call implicit constructor by default
	//The use of having a constructor is we declare everything inside it, because it will call whenever the object is created, no need to create multiple objects
	//If you defined any other constructor java will not call the default constructor
	
	
	public  mConstructorExample() {
		int i=10;
		System.out.println("I'm in the constructor!!");
		//return i;
	}
	
	
	//Types of constructors
	// 1. Implicit
	// 2. Explicit
	// 3. Parameterized
	public  mConstructorExample(String str) {
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		mConstructorExample ce = new mConstructorExample();
		mConstructorExample cep = new mConstructorExample("This is paramterized constructor!!");


	}

}

