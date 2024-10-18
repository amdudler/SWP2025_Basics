package at.amir.school.basics.Wuerfelspiel;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {

    //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
    //Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
    //Er spielt dabei gegen den Computer. Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.

    public static void main(String[] args) {
        Spiel();
    }

    public static void Spiel() {
        Scanner scanner = new Scanner(System.in);
        int AugensummeSpieler = 0;
        int AugensummeComputer = 0;
        boolean Start = true;
        boolean ComputersTurn = false;
        boolean Ergebnis = false;

        while (Start) {
            System.out.println("Willkommen zum Würfelspiel!");
            System.out.println("1. Start");
            System.out.println("2. How to play");
            System.out.println("3. Spiel beenden");

            String option = scanner.nextLine().toLowerCase();

            switch (option) {
                case "start":
                    System.out.println("Sie haben folgende Zahlen gewürfelt: ");
                    Random random1 = new Random();
                    int randomNumber1 = random1.nextInt(6) + 1;
                    AugensummeSpieler += randomNumber1;
                    System.out.println("Erster Würfel: " + randomNumber1);

                    Random random2 = new Random();
                    int randomNumber2 = random2.nextInt(6) + 1;
                    AugensummeSpieler += randomNumber2;
                    System.out.println("Zweiter Würfel: " + randomNumber2);

                    Random random3 = new Random();
                    int randomNumber3 = random3.nextInt(6) + 1;
                    AugensummeSpieler += randomNumber3;
                    System.out.println("Dritter Würfel: " + randomNumber3);

                    Random random4 = new Random();
                    int randomNumber4 = random4.nextInt(6) + 1;
                    AugensummeSpieler += randomNumber4;
                    System.out.println("Vierter Würfel: " + randomNumber4);

                    Random random5 = new Random();
                    int randomNumber5 = random5.nextInt(6) + 1;
                    AugensummeSpieler += randomNumber5;
                    System.out.println("Fünfter Würfel: " + randomNumber5);

                    Random random6 = new Random();
                    int randomNumber6 = random6.nextInt(6) + 1;
                    System.out.println("Sechster Würfel: " + randomNumber6);
                    AugensummeSpieler += randomNumber6;

                    System.out.println("Die Augensumme aller gewürfelten Zahlen beträgt: " + AugensummeSpieler);

                    ComputersTurn = true;
                    while (ComputersTurn) {
                        System.out.println("Scheiben Sie 'Weiter'");

                        String subOption = scanner.nextLine().toLowerCase();

                        switch (subOption) {
                            case "weiter":
                                System.out.println("Der Computer hat folgende Zahlen gewürfelt: ");

                                Random randomcom1 = new Random();
                                int randomNumbercom1 = randomcom1.nextInt(6) + 1;
                                AugensummeComputer += randomNumbercom1;
                                System.out.println("Erster Würfel: " + randomNumbercom1);

                                Random randomcom2 = new Random();
                                int randomNumbercom2 = randomcom2.nextInt(6) + 1;
                                AugensummeComputer += randomNumbercom2;
                                System.out.println("Zweiter Würfel: " + randomNumbercom2);

                                Random randomcom3 = new Random();
                                int randomNumbercom3 = randomcom3.nextInt(6) + 1;
                                AugensummeComputer += randomNumbercom3;
                                System.out.println("Dritter Würfel: " + randomNumbercom3);

                                Random randomcom4 = new Random();
                                int randomNumbercom4 = randomcom4.nextInt(6) + 1;
                                AugensummeComputer += randomNumbercom4;
                                System.out.println("Vierter Würfel: " + randomNumbercom4);

                                Random randomcom5 = new Random();
                                int randomNumbercom5 = randomcom5.nextInt(6) + 1;
                                AugensummeComputer += randomNumbercom5;
                                System.out.println("Fünfter Würfel: " + randomNumbercom5);

                                Random randomcom6 = new Random();
                                int randomNumbercom6 = randomcom6.nextInt(6) + 1;
                                AugensummeComputer += randomNumbercom6;
                                System.out.println("Sechster Würfel: " + randomNumbercom6);

                                System.out.println("Die Augensumme aller gewürfelten Zahlen des Computers beträgt: " + AugensummeComputer);

                                Ergebnis = true;
                                while (Ergebnis) {
                                    System.out.println("Scheiben Sie 'Ergebnis'");
                                    String subsubOption = scanner.nextLine().toLowerCase();
                                    switch (subsubOption) {
                                        case "ergebnis":
                                            if (AugensummeSpieler > AugensummeComputer) {
                                                System.out.println("Sie hast gewonnen! Herzlichen Glückwunsch");
                                            } else if (AugensummeSpieler == AugensummeComputer) {
                                                System.out.println("Es steht Unentschieden! Vielleicht gewinnen Sie beim nächsten mal!");
                                            } else {
                                                System.out.println("Der Computer hat gewonnen! Viel Glück beim nächsten Mal!");
                                            }
                                    }
                                    break;

                                }
                                break;
                        }
                        break;
                    }
                    break;

                case "how to play":
                    System.out.println("Wenn das Spiel startet, hat der Spieler 6 Würfe. ");
                    System.out.println("Er spielt dabei gegen den Computer. Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.");
                    break;

                case "spiel beenden":
                    System.out.println("Spiel wird beendet...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ihre Eingabe ist ungültig!");
                    break;
            }
        }
    }
}