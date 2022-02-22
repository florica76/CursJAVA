package Curs8;

public class OverloadExample2 {
	
	public static void main(String[] args) {
	
		System.out.println(days(3));
		System.out.println(days("Miercuri"));
		
		
	}
	
	
	public static String days(int day) {
		
		switch(day) {
		case 1:
			return "Luni";
		case 2:
			return "Marti";
		case 3:
			return "Miercuri";
		case 4: 
			return "Joi";
		case 5:
			return "Vineri";
		case 6:
			return "Sambata";
		case 7:
			return "Duminica";
		default:
			return "Nr invalid";
		
		}
	}
	
	public static int days(String day){
		switch(day) {
		
		case "Luni":
			return 1 ;
		case "Marti":
			return 2;
		case "Miercuri":
			return 3;
		case "Joi": 
			return 4;
		case "Vineri":
			return 5;
		case "Sambata":
			return 6;
		case "Duminica":
			return 7;
		default:
			return 0;
		
		}
		
	}
	
	

}
