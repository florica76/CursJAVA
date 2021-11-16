package Curs2;

import org.w3c.dom.css.Rect;

public class Rectangle {
    // variabile de clasa, care au doar valoarea default = 0
    private int lenght;
    private int width;
    private int bigArea;

    // constructor :
    public Rectangle (){
        lenght =5;
        width =6;
    }
    // un constructor cu parametri
    public Rectangle(int lenght, int width){
        setLenght(lenght);
        setWidth(width);
    }
    //alt constructor
    public Rectangle ( int lenght, int width, int bigArea){
        setLenght(lenght);
        setWidth(width);
        this.bigArea = bigArea;
    }
    public int calulateNrOfArea(){
        return bigArea / calculateArea();
    }

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
    public int calculateArea(){
        return  lenght * width;
    }
}
