package at.amir.school.basics.KW4.Stunde2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bankverwaltung {
    public static void main(String[] args) {
        Map<String, Bankkonto> KontoInfo = new HashMap<>();

        KontoInfo.put("0001", new Bankkonto("Amir D.", 100));
        KontoInfo.put("0002", new Bankkonto("Goku", 50));
        KontoInfo.put("0003", new Bankkonto("Marco B.", 500));
        KontoInfo.put("0004", new Bankkonto("Karla L.", 1200));
        KontoInfo.put("0005", new Bankkonto("Anastasia D.", 2000));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Ihre Konto-ID ein:");
        String KontoID = scanner.nextLine();

        Bankkonto aktuellesKonto = KontoInfo.get(KontoID);
        if (aktuellesKonto == null) {
            System.out.println("Gastkonto wird erstellt...");
            aktuellesKonto = new Bankkonto(KontoID, 0);
            KontoInfo.put(KontoID, aktuellesKonto);
        }

        while (true) {
            System.out.println("\nWählen Sie eine Aktion:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Banknamen ändern");
            System.out.println("5. Beenden");
            System.out.print("Ihre Wahl: ");

            int Auswahl = scanner.nextInt();
            scanner.nextLine();

            switch (Auswahl) {
                case 1:
                    System.out.print("Betrag zum Einzahlen: ");
                    double einzahlung = scanner.nextDouble();
                    aktuellesKonto.Einzahlen(einzahlung);
                    break;
                case 2:
                    System.out.print("Betrag zum Abheben: ");
                    double abhebung = scanner.nextDouble();
                    aktuellesKonto.Abheben(abhebung);
                    break;
                case 3:
                    aktuellesKonto.Kontostand();
                    break;
                case 4:
                    System.out.print("Neuer Bankname: ");
                    String neuerBankname = scanner.nextLine();
                    Bankkonto.AndereBank(neuerBankname);
                    break;
                case 5:
                    System.out.println("Programm beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Eingabe. Bitte erneut versuchen.");
            }
        }
    }
}

