package at.amir.school.basics.KW4.Stunde2;

public class Bankkonto {
    private String user;
    private double kontostand;
    private static String bankName = "Sparkasse";

    public Bankkonto(String user, double Startbetrag) {
        this.user = user;
        this.kontostand = Startbetrag;
    }

    public void Einzahlen(double Betrag) {
        if (Betrag > 0) {
            kontostand += Betrag;
            System.out.println(Betrag + "€ wurden eingezahlt. Der neue Kontostand beträgt" + kontostand + "€");
        } else {
            System.out.println("Ungültige Eingabe!");
        }
    }

    public void Abheben(double Betrag) {
        if (Betrag > 0 && Betrag <= kontostand) {
            kontostand -= Betrag;
            System.out.println(Betrag + " Euro abgehoben. Neuer Kontostand: " + kontostand + " Euro.");
        } else {
            System.out.println("Nicht genügend Guthaben oder ungültiger Betrag.");
        }
    }

    public void Kontostand() {
        System.out.println("Hallo, " + user + ", Ihr aktueller Kontostand beträgt " + kontostand + "€ bei Ihrer Bank " + bankName);
    }

    public static void AndereBank(String NeuerName) {
        bankName = NeuerName;
        System.out.println("Ihre neue Bank heißt nun " + bankName);
    }
}
