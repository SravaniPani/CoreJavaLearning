package io.basic;

public class fMethodsJava {

	public static void main(String[] args) {
		fMethodsJava mj = new fMethodsJava();
		mj.data();
		// under same package by creating object of another class, we can access the methods of other class
		fMethodsJavaExtension me = new fMethodsJavaExtension();
		me.dataValue();
		
	}
	
	public void data() {
		System.out.println("Hello world");
	}

}
