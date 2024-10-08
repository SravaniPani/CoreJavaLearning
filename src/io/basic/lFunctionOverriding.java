package io.basic;

public class lFunctionOverriding  extends kInheritance{
	
	// Local class methods overrides parent class methods with same name
	
	
	public void engine() {
		System.out.println(" Child Engine speed was 125cc");
	}
	

	public static void main(String[] args) {
		
		kInheritance ki = new kInheritance();
		lFunctionOverriding lfo = new lFunctionOverriding();
		lfo.engine();
		ki.engine();

	}

}
