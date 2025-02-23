package at.amir.school.basics.KW4.Stunde1;

public class Saiyajin {
    // Klassenvariable: gehört zur Klasse und wird von allen Objekten geteilt
    public static String art = "Saiyajin";

    // Instanzvariable: jeder Saiyajin hat einen eigenen Namen
    private String name;

    public Saiyajin(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name des Saiyajins: " + this.name + ", Art des Saiyajins: " + Saiyajin.art);
    }
}
