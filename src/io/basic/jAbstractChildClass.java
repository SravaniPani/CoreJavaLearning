package io.basic;

public class jAbstractChildClass extends  jAbstractMethods {

	public static void main(String[] args) {
		jAbstractChildClass cbc =  new jAbstractChildClass();
		cbc.age();
		cbc.qualification();
	}

	@Override
	public void qualification() {
		System.out.println("Hello");		
	}

}

