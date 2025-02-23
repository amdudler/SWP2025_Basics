package at.amir.school.basics.KW4.Stunde1;

public class Namekianer {
    public static String art = "Namekianer";

    private String name;
    private String rolle;

    public Namekianer(String name, String rolle) {
        this.name = name;
        this.rolle = rolle;
    }

    public void printInfo() {
        System.out.println("Name des Namekianers: " + this.name + ", Art des Namekianers: " + this.art + " Rolle des Namekianers: " + this.rolle);
    }
}
