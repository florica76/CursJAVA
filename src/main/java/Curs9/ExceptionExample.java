package Curs9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(readFile());
		System.out.println("Print dupa metoda readFile()");
		
	}
	
	
	public static String readFile()  {
		
	//	Scanner file = new Scanner(new File("text2.txt"));
	//	return file.nextLine();
		
		try {
				Scanner file = new Scanner(new File("text2.txt"));
				
				return file.nextLine();
			
		}catch (FileNotFoundException e) {
			
			System.out.println("Nu am gasit fisier");
		}
		return null;
		
		

	}
	

}
