package io.basic;

public class muperChild extends muperParent{
	
	//Super keyword is used to access parent properties in child class, when both names are same in parent and child
	
	String text1 = "White";
	
	
	public muperChild()
	{
		// We can use super keyword in constructors as well, to access parent constructor inside the child we need to declare at first before any child methods. 
		super();
		System.out.println("Child constructor");
	}
	
	public void getData() {
		
		// we can use it in methods, to call parent methods
		super.getData();
		System.out.println(text1);
		System.out.println(super.text1);


		
	}

	public static void main(String[] args) {
		muperChild c = new muperChild();
		c.getData();

	}

}
