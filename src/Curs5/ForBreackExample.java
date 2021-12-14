package Curs5;

import java.util.Scanner;

public class ForBreackExample {
    /**
     * Luam un string si vrem sa cautam o litera in stringul respectiv
     * daca gasim litera iesim din program si printam : am gasit litera
     * daca nu o gasim printam ca nu am gasit litera
     *
     */

    public static void main(String[] args) {
        System.out.println("Please enter a text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        char letter = 'a';
        boolean letterFound =false;
        for(int i = 0;i < text.length();i++) {
            char currentLetter = text.charAt(i);
            System.out.println(text.charAt(i) + " index: " + i  );
            if (currentLetter == letter) {
                letterFound = true;
                break;
            }
        }
            if (letterFound){
            System.out.println("Litera A exista in text");
            }
            else {
            System.out.println("Litera A NU exista in text");
            }
    }

}
