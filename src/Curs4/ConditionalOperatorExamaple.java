package curs4;

import java.util.Scanner;

public class ConditionalOperatorExamaple {
	
	/**
	 * Program care citeste 2 numere de la tastatura
	 * Verifica daca fiecare numar este pozitiv
	 * Verifca daca ambele numere sunt pozitive
	 * Verificam care este cel mai mic numar dintre cele 2
	 * 
	 */
	
	public static void main(String[] args) {

	int num1;
	int num2;
	//intrebam 2 numere
	Scanner scan  =  new Scanner(System.in);
	System.out.println("Please enter first number :");
	num1 = scan.nextInt();
	System.out.println("Please enter second number :");
	num2 = scan.nextInt();
	
	/*
	 * //verific daca primul numar este pozitiv if(num1 >0) {
	 * System.out.println("Num1 is positive"); }else {
	 * System.out.println("Num1 is negative"); }
	 * 
	 * //resp = num1 > 0 ? "Num1 is positive" : "Num1 is negative";
	 * 
	 * 
	 * //verificam daca numarul 2 este pozitiv
	 * 
	 * if(num2 >0) { System.out.println("Num2 is positive"); }else {
	 * System.out.println("Num2 is negative"); }
	 * 
	 * //resp = num2 > 0 ? "Num2 is positive" : "Num2 is negative";
	 * 
	 * //verifcam daca ambele numere sunt pozitive if(num1>0 && num2 >0) {
	 * System.out.println("Both numbers are positive"); }else {
	 * System.out.println("Not both numbers are positive"); }
	 * 
	 * //resp = (num1>0) && (num2>0) ? "Both numbers are positive" :
	 * "Not both numbers are positive";
	 * 
	 * //verificam care este cel mai mic numar if(num1 < num2) {
	 * System.out.println("Num1 is the smallest"); }else if(num1 == num2) {
	 * System.out.println("Numbers are equal"); }else {
	 * System.out.println("Num2 is the smallest"); }
	 * 
	 * //resp = num1 == num2 ? "Numbers are equal" : num1<num2 ?
	 * "Num1 is the smallest" : "Num2 is the smallest";
	 * 
	 */	
		
	//ternary operator	
	String resp;
	resp = num1 > 0 ? "Num1 is positive" : "Num1 is negative";
	System.out.println(resp);
	resp = num2 > 0 ? "Num2 is positive" : "Num2 is negative";
	System.out.println(resp);
	resp = (num1>0) && (num2>0) ? "Both numbers are positive" : "Not both numbers are positive";
	System.out.println(resp);
	resp = num1 == num2 ? "Numbers are equal" : num1<num2 ? "Num1 is the smallest" : "Num2 is the smallest";
	System.out.println(resp);
	
	}

}
