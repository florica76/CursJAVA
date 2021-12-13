package Curs3;

import java.util.Scanner;

public class WhatIsYourAge {
    public int age;

    public void askAge() {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Te rog introdu varsta pe care o ai :");
        age = scan.nextInt();
        }

    public void printMessage() {

        if (age < 18 && age > 0) {
            System.out.println("Esti minor.");

        } else if ( age >= 18 && age <= 65) {
            System.out.println("Esti adult.");

        } else if ( age > 65 ) {
            System.out.println("Esti batran.");

        }
        else {
            System.out.println("Te rog sa nu ma minti.");
        }
    }

}

