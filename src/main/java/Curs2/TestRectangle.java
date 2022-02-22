package Curs2;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        System.out.println("rectangle1-default " + rectangle1.calculateArea());
        rectangle1.setLenght(6);
        rectangle1.setWidth(2);
        System.out.println("rectangle1-atribuit " + rectangle1.calculateArea());
        Rectangle rectangle2 = new Rectangle();
        System.out.println("rectangle2-default " + rectangle2.calculateArea());
        Rectangle rectangle3 = new Rectangle(3,3);
        System.out.println("rectangle3 " + rectangle3.calculateArea());
        Rectangle rectangle4 = new Rectangle(5,2,400);
        System.out.println("rectangle4 " + rectangle4.calulateNrOfArea());
    }
}
