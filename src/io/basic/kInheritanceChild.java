package io.basic;

public class kInheritanceChild  extends  kInheritance{
	
	
	public static void main(String[] args)
	{
		kInheritance ki = new kInheritance();
		ki.engine();
		//ki.color();  we cannot access child class methods with parent class objectsS
		kInheritanceChild kic = new kInheritanceChild();
		kic.engine();
		kic.color();
		
	}
	
	
	public void color() 
	{
		System.out.println(color);
	}
	
	


}
