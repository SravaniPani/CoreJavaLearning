package io.basic;

public class mArrays {

	public static void main(String[] args) {
		// Multi Dimensional Array
		
		int [][] md = new int[2][3];
		md[0][0] = 1;
		md[0][1] = 2;
		md[1][0] = 3;
		md[1][1] = 4;
		md[0][2] = 5;
		md[1][2] = 3;
		
		System.out.println(md[0][2]);
		
		
		int [][] b = { {1,3}, {8,5}, {6,7} };
		System.out.println(b[1][0]);
		
		
		for(int i=0;i<2;i++) {
			for(int j=0; j<3;j++) {
				System.out.println(md[i][j]);
			}
		}
		
		

	}

}
