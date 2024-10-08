package io.basic;


// A class can extend more than one interface
public class iInterfaceclass implements iInterfacee, iInterfacee2 {
	
	public static void main(String[] args) {
		iInterfacee i = new iInterfaceclass();
		i.redLigth();
		//i.importantMessage();
		// it will throw a error because you are trying access a class method with a object which represents interface
		
		iInterfaceclass ic = new iInterfaceclass();
		ic.importantMessage();
		
		iInterfacee2 if2 = new iInterfaceclass();
		if2.warning();
		
	}

	@Override
	public void redLigth() {
     System.out.println("Stay away!!");		
	}

	@Override
	public void greenLigth() {
    System.out.println("you can go!");		
	}

	@Override
	public void orangeLigth() {
		System.out.println("ready to start");		
	}
	
	@Override
	public void warning() {
        System.out.println("If you are not wearing helmate, fine will be 1000 per person");		
	}
	
	public void importantMessage() {
		System.out.println("Please wear a helmate");
	}


}
