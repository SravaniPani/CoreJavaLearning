package io.basic.pacakgesDemo;

import io.basic.ofinalKeyWordAndAcessSpecifiers2;

// if you are extend in other package we need to import it

public class AccessSpecifiers  extends ofinalKeyWordAndAcessSpecifiers2{

	public static void main(String[] args) {
		AccessSpecifiers f = new AccessSpecifiers();
		f.increment();
		//f.print(); -- we can't access outside of the package..  because it's default
		 f.print2(); // -- we can access outside of the package..  because it's protected

		

	}

}
