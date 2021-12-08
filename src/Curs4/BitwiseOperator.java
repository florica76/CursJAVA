package curs4;

public class BitwiseOperator {

	public static void main(String[] args) {

		/**
		 *  && --> short circut 
		 *  & --> and 
		 *  
		 *  (x!=0) & (1/x>5) --> evalueaza (x!=0) dupa aceea evalueaza (1/x>5) dupa accea aplica conditia &
		 *  
		 *  (x!=0) && (1/x>5)--> evalueaza (x!=0) daca asta este true evalueaza (1/x>5)
		 *  
		 *  a | b --> evalueaza A dupa accea evalueaza B dupa accea face |
		 *  a || b --> evalueaza A si doar daca A este false evalueaza B 
		 */
		
		int x = 0;
		
		if((x!=0) && (1/x>5)) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");
		}
		
		
		
	}

}
