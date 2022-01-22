package Curs8.Package1;

public class SubClassProtectedAccessModifier  extends ProtectedAccesModifer{
	
	//Subclass in acelasi pachet : yes
	
	
	public static void main(String[] args) {
		
		SubClassProtectedAccessModifier obj =  new SubClassProtectedAccessModifier();
		System.out.println(obj.unu);
		obj.printMesaj();
		
	}
	
	

}
