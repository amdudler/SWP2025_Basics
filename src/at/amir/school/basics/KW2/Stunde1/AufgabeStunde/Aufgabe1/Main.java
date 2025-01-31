package at.amir.school.basics.KW2.Stunde1.AufgabeStunde.Aufgabe1;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mazda", 4);
        myCar.startEngine();
        myCar.honk();
        System.out.println("The car has " + myCar.getNumberOfDoors() + " doors.");
    }
}
