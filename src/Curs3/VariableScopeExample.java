package Curs3;

public class VariableScopeExample {
    // instance variable
    String prenume;

    public static void main(String[] args) {
        VariableScopeExample obj = new VariableScopeExample();
        obj.prenume = "Ceva";
        System.out.println(obj.prenume.length());
        System.out.println(obj.printeazaNume());
    }

    public String printeazaNume(){
        String nume = "Valoare";
        prenume ="Altceva";
        return nume;
    }
}
