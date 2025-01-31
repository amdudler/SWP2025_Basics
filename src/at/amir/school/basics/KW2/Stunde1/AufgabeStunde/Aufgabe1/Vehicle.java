package at.amir.school.basics.KW2.Stunde1.AufgabeStunde.Aufgabe1;

class Vehicle {
    private String brand;

    public Vehicle(String brand) {
            this.brand = brand;
        }

    public void startEngine() {
            System.out.println("The engine of " + brand + " is starting.");
        }

    public String getBrand() {
            return brand;
    }
}

