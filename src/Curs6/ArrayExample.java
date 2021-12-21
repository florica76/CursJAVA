package Curs6;

public class ArrayExample {

	public static void main(String[] args) {

		String[] textArray = new String[5];
		
		textArray[0] = "This";
		textArray[1] = "is";
		textArray[2] = "an";
		textArray[3] = "Array";
		textArray[4] = "!";
		
		try {
		
			System.out.println(textArray[5]);
		
		}catch(ArrayIndexOutOfBoundsException err ) {
			
			System.out.println("Ai incercat sa accesezi un index in afara arrayului");
			
		}catch (NullPointerException e) {
			
			System.out.println("Null pointer ceva");
			
		}catch (Exception e) {
			
			System.out.println("Soemthing went wrong!");

		}
		
		
		for(int i= 0; i<textArray.length; i++) {
			
			System.out.print(textArray[i] + " ");
			
		}
		
		
		//System.out.println("Test");
		
		
			
	}

}
