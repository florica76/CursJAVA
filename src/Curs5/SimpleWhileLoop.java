package Curs5;

public class SimpleWhileLoop {
    public static void main(String[] args) {
        // While loop example
        int i = 10;
        while (i > 0){
            //i--;
            System.out.println(i);
            i--;
        }
        int j =0;
        String[] array ={"one","two","three","four"};
        while (j<array.length){
            System.out.println(array[j]);
            j++;
        }

    }
}
