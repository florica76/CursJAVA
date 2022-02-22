package Curs14;

public class VarargsExample {
    public static void main(String[] args) {
        printStringArguments("One","two","Three");
    }

    public static void printStringArguments(String... value){
        //for (String value : value){
            System.out.println(value);
        //}
    }

}
