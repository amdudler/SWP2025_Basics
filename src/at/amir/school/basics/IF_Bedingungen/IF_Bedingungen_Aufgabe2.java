package at.amir.school.basics.IF_Bedingungen;

import java.util.Random;

public class IF_Bedingungen_Aufgabe2 {
    public static void main(String[] args) {

// Erstelle zwei Zufallszahlen zwischen 0 und 100
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(100);

        Random random2 = new Random();
        int randomNumber2 = random2.nextInt(100);

        System.out.println("Die erste Zahl ist" + randomNumber1);
        System.out.println("Die zweite Zahl ist" + randomNumber2);

// Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
// dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
        if (randomNumber1 < randomNumber2 && randomNumber2 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

// Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
// dann gib aus "Eine der beiden ist kleiner als 30"
        else if (randomNumber1 < 3 | randomNumber2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

// Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
// dann gib aus "Erste Zahl klein, zweite kein 50er"
        else if (randomNumber1 < 50 && randomNumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50er");
        }
    }
}