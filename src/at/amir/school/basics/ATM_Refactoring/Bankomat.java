package at.amir.school.basics.ATM_Refactoring;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        double kontostand = 0.0;
        boolean start = true;

        while (start) {
            System.out.println("Guten Tag! Was möchten Sie heute tun: ");
            System.out.println("1 Einzahlen");
            System.out.println("2 Abheben");
            System.out.println("3 Kontostand anzeigen");
            System.out.println("4 Beenden");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Wie viel wollen Sie einzahlen?");
                    double einzahlen = scanner.nextDouble();
                    kontostand += einzahlen;
                    System.out.println("Es wurden " + einzahlen + "€ eingezahlt. Ihr neuer Kontostand beträgt " + kontostand + "€");
                    break;

                case 2:
                    System.out.print("Wie viel wollen Sie abheben? ");
                    double abheben = scanner.nextDouble();
                    if (abheben <= kontostand) {
                        kontostand -= abheben;
                        System.out.println("Es wurden " + abheben + "€ abgehoben. Ihr neuer Kontostand beträgt " + kontostand + "€");
                    } else {
                        System.out.println("Nicht genug Geld auf dem Konto.");
                    }
                    break;

                case 3:
                    System.out.println("Sie haben " + kontostand + "€ auf ihrem Konto");
                    break;

                case 4:
                    start = false;
                    System.out.println("Schönen Tag noch!");
                    break;

                default:
                    System.out.println("Ihre Eingabe ist ungültig! Bitte geben Sie eine Zahl von 1 bis 4 an!");
            }
        }
    }
}
