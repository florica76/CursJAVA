package Curs11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean verificaSet = set.isEmpty();
        System.out.println("verifica setu e gol sau nu: "+ verificaSet);

        set.add("rosu");
        boolean verificaSet2 = set.isEmpty();
        System.out.println("verifica setu2 e gol sau nu: "+ verificaSet2);
        set.add("mov");
        set.add("galben");
        set.add("verde");
        System.out.println("verifica setu2 e gol sau nu: "+ verificaSet2);

    }
}
