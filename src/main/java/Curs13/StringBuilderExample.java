package Curs13;

public class StringBuilderExample {
	
	
	public static void main(String[] args) {
		
		reverseString("Eu invat java");
		deleteFromString("Eu invat java");
		replaceFromString();
		insertIntoString("HellWorld", 4, "o");
		addSpaces("thisIsACamelCaseText");
		addSpaces("aaaaaabcccccccbddddddddbkkkkkkkkkk");
		appendString();
		
	}

	
	//reverse a string
	public static void reverseString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}	
	
	//delete from string
	public static void deleteFromString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(2, 6);
		System.out.println(sb);	
	}
	//replace from string
	public static void replaceFromString() {
		StringBuilder sb =  new StringBuilder("Salut Bogdan");
		System.out.println(sb);
		sb.replace(6, 12, "Dragos");
		System.out.println(sb);		
	}
	
	//insert into string
	public static void insertIntoString(String text, int index, String textToInser) {
		StringBuilder sb =  new StringBuilder(text);
		System.out.println(sb);
		sb.insert(index, textToInser);
		System.out.println(sb);
	}
	
	//thisIsACamelCaseString 
	
	public static void addSpaces(String camelCase) {
		StringBuilder sb = new StringBuilder(camelCase);
		System.out.println("text initial " + sb);
		for(int i = 0; i<sb.length(); i++) {
			//if(i!=0 && Character.isUpperCase(sb.charAt(i))) {
			if(i!=0 && sb.charAt(i) == 'b') {	
				
				sb.insert(i, " ");
				i++;
			}
			
		}
		System.out.println(sb);
	}
	
	//append
	public static void appendString() {
		StringBuilder sb = new StringBuilder("Salut ");
		System.out.println(sb);
		sb.append("Oana!");
		System.out.println(sb);
		
	}
	
}
