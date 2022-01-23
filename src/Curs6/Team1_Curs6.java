package Curs6;
import java.util.Scanner;
/**
 * Scriem un program care ii cere userului 10 numere. Va pune acele numere
 * intr-un array si va calcula suma lor.
 *
 */
public class Team1_Curs6 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[10];
        Scanner scan = new Scanner(System.in);
        for ( int i= 0; i<10; i++) {
            System.out.println("Please add 10 numers "+ (i+1));
            arrayNumbers[i] = scan.nextInt();
        }
        System.out.println("You written this numbers : ");
        for (int arrayNumber : arrayNumbers) {
            System.out.print(arrayNumber + "; ");
        }
        int sum = 0;
        for (int arrayNumber : arrayNumbers) {
            sum = sum + arrayNumber;
        }
        System.out.println("\nThe sum of this numbers is: " + sum);
        }
    }



