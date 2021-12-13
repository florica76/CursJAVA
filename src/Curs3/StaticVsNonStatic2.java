package Curs3;
public class StaticVsNonStatic2 {
    public static String nume;
    public static String departament = "QA";
    public static void main(String[] args) {
        //StaticVsNonStatic obj =  new StaticVsNonStatic();
        //System.out.println(obj.printeazaMesaj());
        //System.out.println(StaticVsNonStatic.printeazaMesajStatic());
        //obiect 1
        StaticVsNonStatic2  person =  new StaticVsNonStatic2();
        person.nume = "Jhonny ";
        System.out.println(person.nume + departament);
        //obiect 2
        StaticVsNonStatic2 person2 = new StaticVsNonStatic2();
        person2.nume = "Bravo ";
        System.out.println(person2.nume + departament);
        System.out.println("++" +person.nume + departament);
        departament = "DEV";
        //obiect 3
        StaticVsNonStatic2 person3 = new StaticVsNonStatic2();
        person3.nume = "Trei ";
        System.out.println(person3.nume + departament);
        ///
        System.out.println("-------------------------------");
        System.out.println(person.nume + departament);
        System.out.println(person2.nume + departament);
        System.out.println(person3.nume + departament);


    }

}