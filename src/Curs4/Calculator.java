package Curs4;

import java.util.Scanner;

public class Calculator {

	/**
	 * Calculator simplu pentru operatiile de baza +, -, *, / cu 2 numere
	 * Intrebam utilizatorul numarul 1
	 * Intrebam utilizatorul operatia
	 * Intrebam utiliztorul numarul 2
	 * printam operatia si rezultatul
	 * 
	 * Ex: 2+3=5
	 */

	int num1;
	int num2;
	char operation;
	int result;
	
	//intrebam utilizatorul valorile de mai sus
	public void askTheUser() {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter the first number :");
		num1 = scan.nextInt();
		System.out.println("Please enter the operation : ");
		operation =  scan.next().charAt(0);
		System.out.println("Please enter the second number : ");
		num2 = scan.nextInt();
		
	}
	
	//calculam pe baza valorilor
	public void calculateValues() {
		
		if(operation == '+') {
			result =  num1 + num2;
			printResult();
			
		}else if( operation == '-') {
			result =  num1 - num2;
			printResult();
			
		}else if(operation == '*' || operation == 'x') {
			result = num1 * num2;
			printResult();
			
		}else if(operation == '/') {
			result = num1/num2;
			printResult();
		}else {
			System.out.println("Wrong operation! Please enter either : '+' , '-' , '*' , '/' ");
		}
		
	}
	
	
	public void printResult() {
	
		System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
	
	}
	
	
	
	
	
	
}
