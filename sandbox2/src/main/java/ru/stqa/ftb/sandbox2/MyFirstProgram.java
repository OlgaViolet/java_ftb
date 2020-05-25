package ru.stqa.ftb.sandbox2;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Olga");


        Square s = new Square(7);
        System.out.println("Area of the square with the side of " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(3,5);
        System.out.println("Area of a rectangle with sides of " + r.a + " and " + r.b + " = " + r.area());
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");

    }
}
