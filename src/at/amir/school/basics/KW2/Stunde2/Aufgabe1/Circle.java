package at.amir.school.basics.KW2.Stunde2.Aufgabe1;

import at.amir.school.basics.KW2.inheritance1.inheritance3.Shape;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void describe() {
        System.out.println("This is a circle with radius " + radius + ".");
    }
}
