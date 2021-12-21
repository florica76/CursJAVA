package Curs6;

import java.util.Scanner;

public class ForEachExample {

	public static void main(String[] args) {

		
		/**
		 * Luam un string si ca cautam o litera in stringul respectiv
		 * daca gasim litera iesim din program si printam ; am gasit litera
		 * daca nu o gasim printam ca nu am gasit litera
		 */
		
		System.out.println("Please enter a text :");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		//masina
		//012345
		//i==letter --> boolean true
		boolean letterFound = false;
		int counter = 0;
		
		char[] myAarray = text.toCharArray();
		
		for(char ch: myAarray) {
			System.out.println(ch);
			if(ch == letter || ch == 'a') {
				letterFound =  true;
				break;
			}
		}	
		
/*		for(int i =0; i<text.length();i++){
			char currentLetter = text.charAt(i);
			System.out.println(i);
			if(currentLetter == letter || currentLetter == 'a') {
				letterFound =  true;
				counter++;
			//	break;
			}
			
		}
		*/

		
		if(letterFound) {
			System.out.println("Litera A exista in text");
			System.out.println("Counter :" +counter);
		}else {
			System.out.println("Litera A nu exista in text");
		}	
		
	}
		
	}


