package Curs6;

import java.util.Scanner;

/**
 * Scriem un program care numara cate vocale contine textul ” Eu invat Java”.
 * Va printa urmatorul mesaj : Vocale: nr de vocale din text
 *
 * Nota : Vreau sa introduc textul 'String' de la tastatura, si sa imi printeze pozitia fiecarei vocale
 */
public class Team2_Curs6 {
    public static void main(String[] args) {
        //String myText = "Eu invat Java";
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a String to search for voice inside it ! (only small letters) ");
        String myText = scan.nextLine();

        char[] vocale = new char[5];
        vocale[0] = 'a';
        vocale[1] = 'e';
        vocale[2] = 'i';
        vocale[3] = 'o';
        vocale[4] = 'u';
        int count =0 ;
        for (int i = 0; i < myText.length(); i++) {
            for (char c : vocale) {
                if (myText.charAt(i) == c){
                    count++;
                    System.out.println("Char : " + c + " in '" + myText + "' on position :"+ i + ", count is "+ count);
                }

            }


        }
        System.out.println("\nNumber of voice on our String is :" + count);
        }

    }

