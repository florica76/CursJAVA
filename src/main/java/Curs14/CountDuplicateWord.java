package Curs14;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDuplicateWord {
    static String text = "Lorem ipsum dolor sit amet, consectetur\n" +
            "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu\n" +
            "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,\n" +
            "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius\n" +
            "malesuada. Nulla neque lacus, euismod quis erat nec, convallis\n" +
            "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.\n" +
            "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

    public static void main(String[] args) {
        System.out.println("Prima metoda");
        countMethod1();
        System.out.println(" A doua metoda");
        countMethod2();
        System.out.println(" A treia metoda");
        countMethod3();
    }
    public static void countMethod1(){
        Pattern pattern = Pattern.compile("Nulla ");
        Matcher match = pattern.matcher(text);
        int count = 0;
        while (match.find()){
            count++;
        }
        System.out.println("Cuvantul 'Nulla' apare de "+ count + " ori");
    }
    public static void countMethod2(){
        List<Integer> indices = new ArrayList<>();
        StringBuilder sb = new StringBuilder(text);
        int index = 0;
        while (index<sb.length()){
            int wordIndex = sb.indexOf("Nulla ", index);
            if (wordIndex == -1){
                break;
            }
            indices.add(wordIndex);
            index= wordIndex + "Nulla ".length();
        }
        System.out.println("Cuvantul 'Nulla' apare de " + indices.size() + " ori");

    }
    public static void countMethod3(){
        int count = 0;
        String[] wordsArray =text.split(" ");
        for (int i=0;i<wordsArray.length;i++){
            if(wordsArray[i].equals("Nulla")){
                count++;
                }
        }
        System.out.println("Cuvantul 'Nulla' apare de "+ count + " ori");

    }
}
