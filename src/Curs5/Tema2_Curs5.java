package Curs5;

import java.util.Scanner;

/**
 * Scriem o secventa de numere Fibonacci folosind o structura for si
 * inca o data folosind o structura while
 * fiecare număr Fibonacci este suma celor două numere Fibonacci anterioare
 *
 *  see this : https://youtu.be/cum3OrpURzc for fibonacci method
 *
 */
public class Tema2_Curs5 {
    private static long [] fiboCache;
    public static void main(String[] args) {
        System.out.println("We make Fibonacci. Please type integer, recommended <= 93 ( result will be bigger then 'long' type) ");
        Scanner scan = new Scanner(System.in);

        long n1=0,n2=1,n3;
        int nFibo = scan.nextInt();
        System.out.println("We make Fibonacci from number "+ nFibo + " with for :");
            System.out.print(n1+" "+n2);
            for(int i=2;i<nFibo;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
        System.out.println("\nWe make Fibonacci from number "+ nFibo + " with while :");
        long n_2=0,n_1=1,n;
        int j=2;
        System.out.print(n_2+" "+n_1);
            while ( j<nFibo){
                n=n_1+n_2;
                System.out.print(" "+n);
                n_2=n_1;
                n_1=n;
                j++;
            }
        System.out.println("\nWe make Fibonacci from number "+ nFibo + " with 'for' and fibonacci method");
        fiboCache = new long[nFibo+1];
        for (int i = 0; i < nFibo; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\nWe make Fibonacci from number "+ nFibo + " with 'while' and fibonacci method");
        j =2;
        while (j<nFibo){
            System.out.print(fibonacci(j) + " ");
            j++;
        }
    }

    private static long fibonacci(int nFibo ) {
        if ( nFibo <=1){
            return nFibo;
        }
        if (fiboCache [nFibo] != 0){
            return fiboCache[nFibo];
        }
        long nthFiboNumber = (fibonacci(nFibo - 1 ) + fibonacci(nFibo - 2));
        fiboCache[nFibo] = nthFiboNumber;
        return nthFiboNumber;
    }
}
