package io.basic;

public class muperParent {

	String text1 = "Black";

	public muperParent() {
		System.out.println("Parent constructor");
	}

	public void getData() {

		System.out.println(text1);

	}

	public static void main(String[] args) {
		muperParent p = new muperParent();
		p.getData();
	}

}
