package Curs4;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan =  new Scanner(System.in);
        for(int i =1; i<=10; i++) {
            System.out.println("Please enter number "+ i );
            sum = sum + scan.nextInt();
            System.out.println("Pana acum " + sum);
        }
        System.out.println("The sum of numners is " + sum);

    }
}
