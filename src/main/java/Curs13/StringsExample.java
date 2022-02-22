package Curs13;

public class StringsExample {

	public static void main(String[] args) {
		
		//transformToString();
		countWords("Eu invat chineza");
		
	}
	
	public static void countWords(String text) {
		
		String[] words = text.split(" ");
		int nrOfWords = words.length;
		
		System.out.println(nrOfWords);
		System.out.println("Textul meu contine " + nrOfWords + " cuvinte");
		System.out.println(String.format("Textul meu contine %d cuvinte", nrOfWords));
		
	}
	
	
	
	
	public static void transformToString() {
		
		//char
		char ch = 'a';
		String str = Character.toString(ch); 
		String str2 = String.valueOf(ch);
		System.out.println("String is : " + str2);
		System.out.println("String is : " + str);

		//boolean
		boolean bol = true;
		String str3 = Boolean.toString(bol);
		String str4 = String.valueOf(bol);
		System.out.println("String is : " + str3);
		System.out.println("String is : " + str4);
		
		//String str5 = null;
		//System.out.println(String.valueOf(str5));
		//System.out.println(str5.toString());
		
		char[] charArray = {'B', 'u', 'n','a'};
		String str6 = String.valueOf(charArray);
		System.out.println(str6);
		
		
		
	}
	
	
	
}
