package io.basic;

// Multiple inheritance doesn't support in java, because it creates ambiguity.
// To achieve multiple inheritance we are using the concept of interfaces
class A {
	int i = 10;
	
}

	class B extends A {
		int i = 20;

	}

public class kMoreOnInheritance {
    
    public static void main(String[] args) {
    	
    	 A bInstanc = new B();
         System.out.println(bInstanc.i);
         
        // Eventhough you have created the object of B, you won't able to access the variable of B cause it refers to class A
    	
    	// like this you will get value of B
        B bInstance = new B();
        System.out.println(bInstance.i);
       
    }
}
