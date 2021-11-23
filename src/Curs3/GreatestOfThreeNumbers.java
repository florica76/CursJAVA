package Curs3;

import javax.swing.*;
import java.util.Scanner;

public class GreatestOfThreeNumbers {
    int number1;
    int number2;
    int number3;

    // metoda care intreaba utilizatorul 3 numere
    public void askUserForThreeNumbers(){
        System.out.println("Please enter first numbers :");
        Scanner scan = new Scanner(System.in);
        number1 = scan.nextInt();
        System.out.println("Please enter the second numbers :");
        number2 = scan.nextInt();
        System.out.println("Please enter the third numbers :");
        number3 = scan.nextInt();
    }
    // metoda care compara numere si decide care este mai mare
    public void compareThreeNumbers(){
        if (number1 > number2 && number1 > number3){
            System.out.println("The first number is the greatest!");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println("The second number is the greatest!");
        }
        else if(number3 > number1 && number3 > number2){
            System.out.println("The third number is the greatest!");
        }
        else {
            System.out.println("Some of numbers are equal !");
        }

    }
}
