package Curs14;

public class GenericExample {
    public static void main(String[] args) {
    printDetails("Ceva");
    printDetails(22);
    printDetails('v');
    printDetails(45.7);
    }
    public static <T> void printDetails(T obj){
        System.out.println("Obiectul meu este : "+ obj+  " de tipul: "+ obj.getClass().getName());


    }
}
