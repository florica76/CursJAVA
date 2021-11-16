package Curs2;

public class MethodExample {
    /*
    1.numar de camere
    2.calcul de mp. al fiecarei camere
    3. nr. total de mp.
     */
    // Clase = Upper camel case  --> CuvantAltCuvant
    // Metode = lower camel case --> cuvantAltCuvant

    int numarTotal;

    public static void main(String[] args){
        //fara metode, room1
        int lenght1 = 4;
        int width1 = 2 ;
        int room1area = lenght1*width1;
        System.out.println("Area camerei room1 este " + room1area);
        // fara metode, room2
        int lenght2 = 5;
        int width2 = 6 ;
        int room2area = lenght2*width2;
        System.out.println("Area camerei room2 este " + room2area);

        int nrTotalMP = room1area + room2area;
        System.out.println("Area totala este " + nrTotalMP);


        MethodExample room1 = new MethodExample();
        MethodExample room2 = new MethodExample();
        int hol = room1.calculateArea(2,3);
        int baie = room2.calculateArea(4,4);

        System.out.println("Aria camerei room1 este " + room1.calculateArea(2,3));
        System.out.println("Aria camerei room2 este " + room2.calculateArea(4,4));
        System.out.println("Numar toal de MP este " + calculeazaNrTotal(hol, baie, 24, 25) );
    }



    public int calculateArea(int length, int width){
        return length*width;
    }
    public static int calculeazaNrTotal(int ...rooms){
        int result =0;
        for (int room : rooms){
            result = result + room;
        }
        return result;
    }

}
