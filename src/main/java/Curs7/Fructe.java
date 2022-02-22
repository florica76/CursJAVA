package Curs7;

public class Fructe {
	
	public String nume;
	public int calorii;
	public Fructe(String nume, int calorii) {
		this.nume = nume;
		this.calorii = calorii;
	}
	public void printDetaliiFruct() {
		System.out.println( nume + " are " + calorii + " calorii!");
	}
}
