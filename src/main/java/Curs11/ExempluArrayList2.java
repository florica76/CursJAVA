package Curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class ExempluArrayList2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("zero", "unu", "doi", "trei", "patru", "cinci"));
        arrayList.add("sase");
        for (String nr : arrayList) {
            System.out.println(nr);
        }
        System.out.println("---------------------------------");
        arrayList.subList(1,4).clear();
        for (String nr : arrayList) {
            System.out.println(nr);
        }
        String element = "unu";
        if (arrayList.contains("element")){
            System.out.println(element + " se afla in lista");
        }
        else {
            System.out.println(element + " Nu se afla in lista");
        }
        arrayList.set(0,"opt");
        for (String nr : arrayList) {
            System.out.println(nr);
        }
        System.out.println("--------iterator-----------");
        Iterator<String> iterator = arrayList.listIterator();
        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}