package io.basic;

public class ofinalKeyWordAndAcessSpecifiers {
	
	// when you assign "final" keyword to class or variable you can't access it when you use it to class you can't extend it

	int i =10;
	final int j=20;
	
	protected String text ="Hello Protected";
	 String text2 ="Hello Default";

	
	public void increment() {
		i++;
		System.out.println(i);
		//j++;   //--> you can't modify it.. because it declared as final
		System.out.println(j);
		
	}
	
	
	final void increment2() {
		i++;
		System.out.println(i);
		//j++;   --> you can't modify it.. because it declared as final
		System.out.println(j);
		
	}
	
	void print() {
		System.out.println("Default");
	}
	
	
	protected void print2() {
		System.out.println("Protected");
	}
	
	
	private void print3() {
		System.out.println("Private");
	}
	public static void main(String[] args) {
		ofinalKeyWordAndAcessSpecifiers f = new ofinalKeyWordAndAcessSpecifiers();
		f.increment();
		f.increment2();
		f.print();
		f.print2();
		f.print3();
		
	}
		
}
