package io.basic;

public abstract  class jAbstractMethods {

	public static void main(String[] args) {

		// Method without body are called as abstract methods..
		// If a class contains atleast one abstract method, then that class is called as Abstract class
		// unlike interfaces abstract class can have methods with implementation also.. so with abstraction we can achieve only partial abstraction.
		// we can't create object for abstract classes.
		// we can't use private modifier for the methods declared in abstract classes.. because the goal is here like someone has to use it
		
	}
	 
	//jAbstractMethods j = new jAbstractMethods();
	public void name() {
		System.out.println("Type your name here..");
	}
	
	
	public void age() {
		System.out.println("Type your age here..");
	}
	
	public abstract void qualification();

}
