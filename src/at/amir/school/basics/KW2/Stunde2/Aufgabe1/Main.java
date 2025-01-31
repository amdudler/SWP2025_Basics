package at.amir.school.basics.KW2.Stunde2.Aufgabe1;

import at.amir.school.basics.KW2.inheritance1.inheritance3.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.describe();
        System.out.println("Area of the circle: " + circle.area());

        Rectangle rectangle = new Rectangle(4.0, 5.0);
        rectangle.describe();
        System.out.println("Area of the rectangle: " + rectangle.area());
        rectangle.describe("A large blue rectangle");
        }
}
