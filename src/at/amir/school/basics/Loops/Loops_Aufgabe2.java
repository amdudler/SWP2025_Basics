package at.amir.school.basics.Loops;

public class Loops_Aufgabe2 {
    public static void main(String[] args) {

//Zähle die geraden Ziffern zwischen 1 und 1000 zusammen
//Tipp: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.

        int gerade = 0;

        for (int i = 2; i <= 1000; i += 2) {
            gerade += i;
        }
        System.out.println(gerade);
    }
}


