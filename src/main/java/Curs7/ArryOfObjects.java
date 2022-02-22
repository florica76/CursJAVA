package Curs7;
public class ArryOfObjects {
	public static void main(String[] args) {
		Fructe fructe[] = new Fructe[4];
		fructe[0] = new Fructe("para", 100);
		fructe[1] =  new Fructe("pruna", 30);
		fructe[2] = new Fructe("banana", 180);
		fructe[3] = new Fructe("portocala", 99);
		
		Fructe mar = new Fructe("mar", 89);
	//	mar.printDetaliiFruct();
		for(Fructe fruct : fructe) {
			fruct.printDetaliiFruct();
		}
	}
}
