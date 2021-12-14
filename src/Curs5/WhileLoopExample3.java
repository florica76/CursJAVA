package Curs5;

import java.util.Scanner;

public class WhileLoopExample3 {
    /**
     * facem un program care calculeaza salariul pe saptamana
     * intrebam utilizatorul cate ore a lucrat
     * dupa care calculam atat timp cat nr. de pre nu este mai mare de 40 sau mai mic de 1
     * daca nr de ore nu este valid il rugam sa introduce un numar valid de ore
     *
     */
    public static void main(String[] args) {
        //ce stim
        int maxAllowedHoursWorked = 40;
        int ratePerHour = 15;
        //ce nu stim
        System.out.println("Cate ore ai lucrat saptamana asta ? :");
        Scanner scan = new Scanner(System.in);
        int hoursWorked = scan.nextInt();
        // validarea
        while (hoursWorked > maxAllowedHoursWorked || hoursWorked < 1 ){
            System.out.println("Numar invalid de ore");
            System.out.println("Intro du un numar valid de ore care sa fie mai mic decat 40 :");
            hoursWorked = scan.nextInt();

        }
        System.out.println("Salariul de plata este :" + hoursWorked*ratePerHour);
    }
}
