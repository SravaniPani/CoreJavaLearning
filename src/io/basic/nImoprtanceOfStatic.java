package io.basic;

public class nImoprtanceOfStatic {
	
	//Static variables can be used with the help of objects. That will be used to save the memory.
	//Static block represents that all the initalisation of static variables will be declared inside it.
	
	String name;
	String area;
	//static String city = "Bangalore";
	static String city;
	
	static {
		city= "Bangalore";
	}
	
	
	
	nImoprtanceOfStatic(String name, String ar){
		this.name = name;
		this.area = ar;
		
	}
	
	public void getUserData() {
		System.out.println(name);
		System.out.println(area);
		System.out.println(city);


	}
	
	

	public static void main(String[] args) {
		nImoprtanceOfStatic s = new nImoprtanceOfStatic("Sravani", "Brookfiled");
		nImoprtanceOfStatic s2 = new nImoprtanceOfStatic("Vijju", "Kengeri");
		s.getUserData();
		s2.getUserData();

		
		
		
	}

}
