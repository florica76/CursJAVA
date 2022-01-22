package Curs8;

public class OverloadExample {
	
	
	public static void main(String[] args) {
		
		System.out.println(multiply(3, 3));
		System.out.println(multiply(2.6, 3.7));
		System.out.println(multiply(1.6, 2.9));

		
	}
	
	
	public static int multiply(int a, int b) {
		return a*b;
	} 
	
	public static double multiply(double a , double b) {
		
		return a*b;
	}

	
	
	
}
