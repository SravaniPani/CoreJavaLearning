package io.basic;

public class mThisKeyWordUsage {
	
	public mThisKeyWordUsage() {
		int a=25;
		System.out.println(a);
	}
	
	int a =10;
	
	public void dataSheet() {
		// this keyword is used to refer a thing and that is having global scope.
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		mThisKeyWordUsage tku = new mThisKeyWordUsage();
		tku.dataSheet();
		System.out.println("*****************");
		System.out.println(tku.a);

	}

}
