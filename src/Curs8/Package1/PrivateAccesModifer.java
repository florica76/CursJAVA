package Curs8.Package1;

public class PrivateAccesModifer {
	
	/**
	 * Scopul Private este limitat la clasa in care se afla
	 * Clasa sau interfata nu pot fi declarate ca Private
	 * 
	 * Same class : yes
	 * subclass same package : no
	 * other class same package : no
	 * subclass other package : no
	 * other class other package : no
	 * 
	 * 
	 */
	
	private static String mesaj = "Hello";
	public  static String word = "there";
	
	
	public static String getMesaj() {
		return mesaj;
	}
	public static void setMesaj(String mesaj) {
		PrivateAccesModifer.mesaj = mesaj;
	}
	
	/**
	 * Constructor privat : impiedica crearea unui obiect al acestei clase in afara ei
	 */
	
	//private PrivateAccesModifer() {}
	
	

}
