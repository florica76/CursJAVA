package Curs2;

public class Shape {

    public Shape(int lenght) {
        System.out.println("The area of a square is : " + calculateRectangleArea(lenght,lenght));
    }

    public Shape(int lenght,int width){
        System.out.println("The area of a rectangle is : " + calculateRectangleArea(lenght,width));
    }

    public Shape(double radius){
        System.out.println("The area of a circle is : " + calculateCircleArea(radius));
    }
    int calculateRectangleArea(int lenght, int width) {
        return lenght * width;
    }

    double calculateCircleArea(double radius) {
        return radius * radius * Math.PI;
    }

}