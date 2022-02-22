package Curs4;

public class Palindrome {

	
	public void checkIfWordIsPalindrome(String cuvant) {
		
		//radar
		//masina ->lenght = 6
		//m a s i n a
		//0 1 2 3 4 5

		
		//cuvant 
		// cuvantIntros
		//for --> citim de la final fiecare charater din cuvant si il stocam in cuvantIntors
		// cuvant == cuvatIntros --> este palindrom
		
		String cuvantIntors = "";
		
		for(int i = cuvant.length()-1; i>=0; i-- ) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			
		}
		
		System.out.println("Cuvant original :" + cuvant);
		System.out.println("Cuvant intors :" + cuvantIntors);

		
		if(cuvantIntors.equals(cuvant)) {
			System.out.println("Cuvantul este palindrome");
		}else {
			System.out.println("Cuvantul nu este palindrome");
		}
		
		
		
		
		
		
		
	}
	
	
}
