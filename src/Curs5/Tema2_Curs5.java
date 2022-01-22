package Curs5;

import java.util.Scanner;

/**
 * Scriem o secventa de numere Fibonacci folosind o structura for si
 * inca o data folosind o structura while
 * fiecare număr Fibonacci este suma celor două numere Fibonacci anterioare
 */
public class Tema2_Curs5 {
    public static void main(String[] args) {
        System.out.println("We make Fibonacci. Please type integer, recommanded < 50");
        Scanner scan = new Scanner(System.in);
        int n1=0,n2=1,n3,i,numberFibo = scan.nextInt();
        System.out.println("We make Fibonacci from number "+ numberFibo + " with for :");
            System.out.print(n1+" "+n2);
            for(i=2;i<numberFibo;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
        System.out.println("\nWe make Fibonacci from number "+ numberFibo + " with while :");
        int n_2=0,n_1=1,n,j=2;
        System.out.print(n_2+" "+n_1);
            while ( j<numberFibo){
                n=n_1+n_2;
                System.out.print(" "+n);
                n_2=n_1;
                n_1=n;
                j++;

            }
    }
}
