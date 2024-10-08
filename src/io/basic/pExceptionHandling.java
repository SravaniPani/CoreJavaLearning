package io.basic;

public class pExceptionHandling {

	// whenever we are feeling there will be error, we need to write in try and
	// catch block
	// A try block can have multiple catch blocks
	// Which catch block is perfect
	// Finally block executes irrespective of everything.. it will not execute..
	// whenever the program was terminated in middle
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {

			int k = a / b;
			System.out.println(k);
		}

//		catch (ArithmeticException et)
//
//		{
//			System.out.println("I catched the Arthimetic/exception");
//		}

		catch (Exception et)

		{
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block");

		}

	}
	
}
