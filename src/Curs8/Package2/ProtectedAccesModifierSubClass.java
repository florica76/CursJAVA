package Curs8.Package2;

import Curs8.Package1.ProtectedAccesModifer;

public class ProtectedAccesModifierSubClass extends ProtectedAccesModifer {
	
	public static void main(String[] args) {
		
		ProtectedAccesModifierSubClass obj = new ProtectedAccesModifierSubClass();
		System.out.println(obj.unu);
		obj.printMesaj();
		
		
	}
	

}
