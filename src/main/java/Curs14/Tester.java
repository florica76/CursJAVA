package Curs14;

public class Tester<T> {
    //String age;
    //int age;
    T age;
    public Tester(T age){
        this.age =age;

    }
    public void printAge(){
        System.out.println("Valoarea lui age este "+ this.age);

    }
}
