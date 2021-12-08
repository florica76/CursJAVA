package Curs4;

import java.util.Scanner;


public class ForExample2 {
	
	//program care intreaba user ul un caracter
	//mai intreaba un numar
	//va lua carcaterul si va printa atatea linii si coloane cate sunt date in numar
	// Ex: 
	// char :*
	// numar : 4
	//****
	//****
	//****
	//****
	
	public static void main(String[] args) {
		
		char charater;
		int num;
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter a char :");
		charater =  scan.next().charAt(0);
		System.out.println("Please enter a number :");
		num = scan.nextInt();
		
		//for pentru nr de linii
		for(int i=0; i<num; i++) {
			
			//for pentru caracter
			for(int j=0; j<num; j++) {
				
				System.out.print(charater);
		
			}
			System.out.println();
			
		}
			
	
		
	}
	

}
