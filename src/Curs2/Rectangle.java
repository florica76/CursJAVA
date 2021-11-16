package Curs2;

public class Rectangle {
    // variabile de clasa, care au doar valoarea default = 0
    private int lenght;
    private int width;

    public void setLenght(int lenght) {
        this.lenght = lenght;
        // ia variablia lenght de la nivelul de clasa ( this.lenght)
        // si ii atibuie (=) valoarea pe care o primeste ca si parametru al metodei

    }
    public int getLenght(){
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
