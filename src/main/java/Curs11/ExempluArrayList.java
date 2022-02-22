package Curs11;

import java.util.ArrayList;
import java.util.List;

public class ExempluArrayList {
    public static void main(String[] args) {
        // obj arr[]] = new Object[6]
        List<String> list = new ArrayList<>();
        // add element to array list
        list.add("oana");
        list.add("ion");
        list.add("gabriel");
        list.add("maria");
        System.out.println("Print array list size: "+ list.size());

        list.add("carmen");
        System.out.println("Print array list size: "+ list.size());

        System.out.println("Get element at index: "+ list.get(0));

        for (String nume : list){
            System.out.println(list.indexOf(nume) + ": " + nume);
        }
        list.add(5,"tara");
        System.out.println("Print array list size: "+ list.size());
        for (String nume : list){
            System.out.println(list.indexOf(nume) + ": " + nume);
        }
        list.add("mara");
        System.out.println("Print array list size: "+ list.size());
        for (String nume : list){
            System.out.println(list.indexOf(nume) + ": " + nume);
        }
        list.add(3,"george");
        System.out.println("Print array list size: "+ list.size());
        for (String nume : list){
            System.out.println(list.indexOf(nume) + ": " + nume);
        }
        list.remove("george");
        System.out.println("Print array list size: "+ list.size());
        for (String nume : list){
            System.out.println(list.indexOf(nume) + ": " + nume);
        }
        list.clear();
        System.out.println("Print array list FINAL size: "+ list.size());
        for (String nume : list){
            System.out.println("My final list is :" + list.indexOf(nume) + ": " + nume);
        }
    }
}
