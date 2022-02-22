package Curs9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
	
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		testceva();
		
	}
	
	
	public static void testceva() throws InterruptedException, FileNotFoundException {
		String[] week = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
		
		for(String day: week) {
			Thread.sleep(3000);
			System.out.println(day);
			
		}
		
		Scanner scan = new Scanner(new File("text.txt"));
	}
	

}
