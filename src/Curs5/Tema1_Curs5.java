package Curs5;

/**
 * Homework. Ex: 1- do --while
 * Scriem un program care simuleaza un login.
 * Programul primeste input de la utilizator un user si o parola.
 * Are trei incercari de logare
 * Atata timp cat incearca de trei ori si credentialele sunt gresite programul va
 * printa : “Maximum attempts reached. User blocked”
 * Pentru fiecare incercare gresita programul printeaza : “Login Error”
 * Daca credentialele sunt valide programmul printeaza : “Login Sucessful”
 * Note:
 * Userul este String si valoarea valida este: “TestUser”
 * Parola este int si valoarea valida este :1234
 */
import java.util.Objects;
import java.util.Scanner;
public class Tema1_Curs5 {
    public static void main(String[] args) {
        int triesleft = 3;
        do {
            System.out.println("Enter a user :");
            Scanner scan_user = new Scanner(System.in);
            String user_username = scan_user.next();
            System.out.println("Enter a password :");
            Scanner scan_password = new Scanner(System.in);
            int user_password = scan_password.nextInt();
            if (Objects.equals(user_username, "TestUser") && user_password == 1234 ){
                System.out.println("Login successful");
                break;
            }
            else {
                triesleft--;
                System.out.println("Login Error");
                if (triesleft == 0){
                    System.out.println("Maximum attempts reached. User blocked”");
                    break;
                }
            }

        }while ( true);

    }
}
