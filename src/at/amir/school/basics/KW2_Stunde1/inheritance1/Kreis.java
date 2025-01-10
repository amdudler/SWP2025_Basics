package at.amir.school.basics.KW2_Stunde1.inheritance1;

public class Kreis extends Figur {
    private double radius = 50.0;

    public Kreis(double x, double y, double rad) {
        super(x, y);
        if (rad >= 0)
            radius = rad;
        System.out.println("Kreis-Konstruktor");
    }

    public Kreis() {
        System.out.println("Kreis-Konstruktor");
    }
}
