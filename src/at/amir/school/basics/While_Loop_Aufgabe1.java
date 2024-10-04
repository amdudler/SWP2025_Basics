package at.amir.school.basics;

import java.util.Random;

public class While_Loop_Aufgabe1 {
    public static void main(String[] args) {

//Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.

        int sum = 0;
        Random random = new Random();
        int randomNumber;
        boolean isFinished = false;

// Das Programm soll die Zufallszahlen zusammenzählen.

        while (!isFinished) {
            randomNumber = 10 + random.nextInt(21);
            System.out.println("Die Zufallszahl ist " + randomNumber);

// Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

            if (randomNumber == 15 || 25 == randomNumber) {
                System.out.println("Die Zahl " + randomNumber + " wurde generiert. Das Programm wird beendet");
                isFinished = true;
            }
            else {
                sum += randomNumber;
            }

        }
        System.out.println("Summe der Zufallszahlen: " + sum);

    }
}
