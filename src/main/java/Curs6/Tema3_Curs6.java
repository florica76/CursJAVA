package Curs6;

/**
 * Scriem un program care verifica daca avem nume duplicate in
 * urmatorul array :
 * String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
 * Daca le gaseste , printeaza  numele duplicat.
 * Nota: O posibila solutie ar fi sa luati fiecare nume si sa il comparati cu restul.
 * Un for in for ar putea sa fie de ajutor.
 * Bineinteles ca orice solutie care functioneaza ar putea fi buna :)
 *
 */
public class Tema3_Curs6 {
    public static void main(String[] args) {
        String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
        System.out.print("This is our list of names: " );
        for (String nume : myStringArray){
            System.out.print(nume + " ");
            }
        System.out.println("\nSearch for duplicate names : ");
        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = i + 1 ; j < myStringArray.length; j++) {
                if (myStringArray[i].equals(myStringArray[j])) {
                    System.out.println("Name "+ myStringArray[i] + " is duplicate !");
                }
            }
        }

    }
}
