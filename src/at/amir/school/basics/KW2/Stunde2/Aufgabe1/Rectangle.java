package at.amir.school.basics.KW2.Stunde2.Aufgabe1;

import at.amir.school.basics.KW2.inheritance1.inheritance3.Shape;

class Rectangle extends Shape {
    private double length;
    private double width;

        public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void describe() {
        System.out.println("This is a rectangle.");
    }

    public void describe(String description) {
        System.out.println("This is a rectangle described as: " + description + ".");
    }
}