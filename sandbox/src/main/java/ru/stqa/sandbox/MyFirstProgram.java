package ru.stqa.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Olga");

        double len = 7;
        System.out.println("Area of the square with the side of " + len + " = " + area(len));

        double length = 3;
        double width = 5;
        System.out.println("Area of a parallelogram with sides of " + width + " and " + length + " = " + area(length, width));
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");

    }

    public static double area (double l) {
       return l * l;
    }


    public static double area (double length, double width) {

        return length * width;
    }
}