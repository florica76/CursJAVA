package Curs3;

public class Car {
        static String brand;
        static String type;
        static String engine;

    public Car (String brand, String engine){
        this.brand = brand;
        this.engine= engine;
        type = "Suv";
    }
        static String carDetails(){

        return "All " + brand + " cars are " + engine + " and are of type " + type;

    }
        }

