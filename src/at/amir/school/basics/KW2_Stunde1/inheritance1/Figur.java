package at.amir.school.basics.KW2_Stunde1.inheritance1;

public class Figur {
    private double xpos = 100.0, ypos = 100.0;

    public Figur(double x, double y) {
        if (x >= 0 && y >= 0) {
            xpos = x;
            ypos = y;
        }
        System.out.println("Figur-Konstruktor");
    }

    public Figur() {
        System.out.println("Figur-Konstruktor");
    }
}
