package Curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrycatchExample2 {
	
	public static void main(String[] args) {
		
		try {
			
		Scanner scan = new Scanner(System.in);	
		System.out.println("Introdu un numar:");
		int num1 = scan.nextInt();
		System.out.println("Introdu alt numar:");
		int num2 = scan.nextInt();
			System.out.println(num1/num2);
		
		}catch( ArithmeticException e) {
			System.out.println("You should not divide by zero");
			System.out.println("Please try again :");
			Scanner scan = new Scanner(System.in);	
			System.out.println("Introdu un numar:");
			int num1 = scan.nextInt();
			System.out.println("Introdu alt numar:");
			int num2 = scan.nextInt();
				System.out.println(num1/num2);
		//	e.printStackTrace();
			
		}catch(InputMismatchException e) {
			System.out.println("Please enter only numeric!");
			System.out.println("Please try again :");
			Scanner scan = new Scanner(System.in);	
			System.out.println("Introdu un numar:");
			int num1 = scan.nextInt();
			System.out.println("Introdu alt numar:");
			int num2 = scan.nextInt();
				System.out.println(num1/num2);
			
		}catch(Exception e) {
			System.out.println("Something went wrong!");
			
		}
		
		
	}
	
	

}
