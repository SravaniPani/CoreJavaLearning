package io.basic;

public class hNestedLoops {

	public static void main(String[] args) {
		//A simple demo program on the concept of inner and outer loop
		// to run one outer loop.. 4 times we need to run inner loop
		
		for(int i=0; i<4;i++) {
			System.out.println("Hi, I'm inner loop");
			for(int j=0;j<4;j++) {
				System.out.println("Hi, I'm outer loop");
			}
		}
		
		System.out.println("*************************");
	
	
		int k=1;
	
	for(int i1=0; i1<4;i1++) {
		for(int j1=1; j1<4-i1; j1++) {
			System.out.print(k);
			System.out.print("\t");
			k++;
			
		}
		System.out.println(" ");


	}
	
	System.out.println("*************************");

	for(int i=1;i<5;i++)
	{
	for(int j=1;j<=i;j++)
	{
	System.out.print(j);
	System.out.print("\t");

	}
	System.out.println("");

	}

	}


	
}	


