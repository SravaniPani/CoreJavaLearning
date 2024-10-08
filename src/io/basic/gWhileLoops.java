package io.basic;

public class gWhileLoops {

	public static void main(String[] args) {

		
		// when the boolean value means some condition is true, then only it will execute and we have to make that condition either increment or decrement like performing some operation
		// it's a entry level iterative statement
		int i=1;
		while(i<11) {
			System.out.println(i);
			// till this condition it will keep on execute, because you haven't given any condition yet.
			i++;
			
		}
		
		
		System.out.println("***********************************************************");
		
		// printing it in reverse order
		
		int i1=10;
		while(i1>0) {
			System.out.println(i1);
			// till this condition it will keep on execute, because you haven't given any condition yet.
			i1--;
			
		}
		
		
		System.out.println("********************************");

		
		
		
		// do while is exit level iterative looping statement.
		// here one time of execution is guarantee not like while loop
		
		int n=20;
		do {
			System.out.println(n);
			n++;
		}while(n>30);
		
		System.out.println("********************************");

		
		//corrected code.
		
		
		int m=20;
		do {
			System.out.println(m);
			m++;
		}while(m<30);
		
		
	}

}
