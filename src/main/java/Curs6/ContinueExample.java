package Curs6;

public class ContinueExample {
	
	
	public static void main(String[] args) {
		
		
		/*
		 * for(int i = 0; i<6; i++) {
		 * 
		 * if(i==3) { continue; }
		 * 
		 * System.out.println(i); }
		 */
		
	
		int i = 6;
		
		while(i>0) {
			
			if(i==3) {
				i--;
				continue;
			}
			System.out.println(i);
			i--;
			
		}
		
		
	}
	
	

}
