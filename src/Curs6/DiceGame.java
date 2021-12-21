package Curs6;

import java.util.Scanner;

public class DiceGame {

	/**
	 * Facem un joc de zaruri in care avem urmatoarele reguli :
	 * daca userul da in total : 2, 6, 12 Pierde //break
	 * daca userul da in total : 7, 11 Castiga	//break
	 * daca userul da in total : 3, 10 Repeta  //continue
	 * daca nu da oricare dintre valorile de mai sus, 
	 * intrebam daca vrea sa mai dea inca o data. Raspuns boolean
	 */
		
	public static void main(String[] args) {

	
		/*
		 * int dice1 = (int) (Math.random()*6+1); int dice2 = (int) (Math.random()*6+1);
		 * System.out.println(Math.random()); System.out.println(Math.random()*6+1);
		 * System.out.println(dice1); System.out.println(dice2);
		 */
			
		boolean condition = true;
		
		while(condition) {
			int dice1 = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);		
			int sum  = dice1+dice2;
			
			System.out.println("Ai dat : " + sum );
			
			//daca userul da in total : 2, 6, 12 Pierde //break	
			if(sum == 2 || sum == 6 || sum == 12) {
				System.out.println("Imi pare rau ai dat :" + sum + " Ai pierdut!");
				break;
			}
//			 * daca userul da in total : 7, 11 Castiga	//break
			else if(sum == 7 || sum == 11) {
				System.out.println("Ai dat :" + sum + " Ai castigat!");
				break;
			}
			//	 * daca userul da in total : 3, 10 Repeta  //continue
			else if(sum == 3 || sum == 10){
				System.out.println("Ai dat : "+ sum + " Automat mai dai o data!");
				continue;
				
			}
		
			System.out.println("Mai dai o data?");
			Scanner scan =  new Scanner(System.in);
			condition = scan.nextBoolean();
		
		}
		
		
		
		
		
		
		
		
	}

}
