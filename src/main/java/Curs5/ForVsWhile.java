package Curs5;

import java.util.Scanner;

public class ForVsWhile {

        /**
         * Facem un program care-i cere utilizatorului numerele pe care le aduna
         * Userul introduce cate numere vrea ( fara limita)
         * Cand vrea sa iasa din program utilizatorul introduce 0 ( zero )
         */
        public static void main(String[] args) {
        rezolvareCuWhile();
        rezolvareCuFor();
    }

    //rezolvare cu while
    public static void rezolvareCuWhile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x = scan.nextInt();
        int sum =0;
        while(x != 0){
            sum+=x;//sum = sum + x;
            System.out.println("Please enter a number:");
            x = scan.nextInt();
        }
        System.out.println("Total sum of entered numbers " + sum);

    }
    //rezolvare cu for
    public static void rezolvareCuFor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int sum = 0;
        for (int x = scan.nextInt();x!=0;x= scan.nextInt()){
            sum+=x;
            System.out.println("Please enter a number:");
        }
        System.out.println("Total sum of entered numbers " + sum);
    }
}
