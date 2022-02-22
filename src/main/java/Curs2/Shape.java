package Curs2;

public class Shape {

    public Shape(int length) {
        System.out.println("The area of a square is : " + calculateRectangleArea(length,length));
    }

    public Shape(int length,int width){
        System.out.println("The area of a rectangle is : " + calculateRectangleArea(length,width));
    }

    public Shape(double radius){
        System.out.println("The area of a circle is : " + calculateCircleArea(radius));
    }
    int calculateRectangleArea(int length, int width) {
        return length * width;
    }

    double calculateCircleArea(double radius) {
        return radius * radius * Math.PI;
    }

}