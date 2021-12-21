package Curs6;

import java.util.Random;

public class ArrayExampleProgram {
	
	public final int LENGHT = 6;
	public final int MAX_NUMBERS = 9;

	public static void main(String[] args) {

		/**
		 * Facem un program care genereaza nr random si le tine intr-un array
		 * Dupa printam array-ul
		 * Search in array
		 */
		
		
		ArrayExampleProgram ex =  new ArrayExampleProgram();
		ex.printNumbers(ex.generateNumbers());

		
	}

	public int[] generateNumbers() {
		int[] numbers = new int[LENGHT];
		
		Random random = new Random();
		
		
		for(int i=0; i<LENGHT;i++) {
		
			int randomNR = 0;
			
			do {
				randomNR = random.nextInt(MAX_NUMBERS);			

			}while(search(numbers, randomNR));
			
			numbers[i] = randomNR;
		}
		
		
		return numbers;
	}
	
	
	public void printNumbers(int[] arr) {
		
		for(int nr : arr) {
			
			System.out.print( nr + " | " );
		}
		
	}
	
	
	public boolean search(int[] array, int nrToSearchFor) {
		
		for(int value : array ) {
			
			if(nrToSearchFor == value) {
				return true;
			}
			
		}
		return false;
	}
	
	
	
}
