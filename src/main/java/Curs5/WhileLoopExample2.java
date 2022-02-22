package Curs5;

import java.util.Scanner;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        //for
        for ( int i =1; i <=10; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
        System.out.println("----------------------------------");
        //while
        int x =1;
        while (x<=10){
            System.out.println(number + " * " + x + " = " + number*x);
            x++;
        }
    }
}
