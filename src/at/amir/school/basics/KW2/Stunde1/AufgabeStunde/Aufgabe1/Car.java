package at.amir.school.basics.KW2.Stunde1.AufgabeStunde.Aufgabe1;

import at.amir.school.basics.KW2.Stunde1.AufgabeStunde.Aufgabe1.Vehicle;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
            super(brand);
            this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
            System.out.println("The " + getBrand() + " car is honking!");
    }

    public int getNumberOfDoors() {
            return numberOfDoors;
    }
}

