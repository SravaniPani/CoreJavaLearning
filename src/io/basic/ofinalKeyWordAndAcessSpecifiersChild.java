package io.basic;

public class ofinalKeyWordAndAcessSpecifiersChild extends ofinalKeyWordAndAcessSpecifiers {

	public static void main(String[] args) {
		ofinalKeyWordAndAcessSpecifiers f = new ofinalKeyWordAndAcessSpecifiers();
		f.print();  
		System.out.println(f.text2);
		
		// you can access default methods in package of same class
		
		
		f.print2();
		System.out.println(f.text);
		
		// you can access protected methods in package of same class
		
		
		//f.print3();  ---> Private methods we can't access out of the class  

	}

}
