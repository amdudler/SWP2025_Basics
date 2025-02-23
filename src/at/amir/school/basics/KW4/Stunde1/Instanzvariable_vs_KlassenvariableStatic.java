package at.amir.school.basics.KW4.Stunde1;

public class Instanzvariable_vs_KlassenvariableStatic {
    public static void main(String[] args) {
        Saiyajin goku = new Saiyajin("Goku");
        Saiyajin vegeta = new Saiyajin("Vegeta");
        Namekianer piccolo = new Namekianer("Piccolo", "Krieger");
        Namekianer kami = new Namekianer("Kami", "Heiliger");

        System.out.println("------------Instanzvariable------------");
        goku.printInfo();
        vegeta.printInfo();
        piccolo.printInfo();
        kami.printInfo();

        Saiyajin.art = "Super Saiyajin";
        Namekianer.art = "Heiliger Namekianer, ";

        System.out.println("-------------Klassenvariable------------");
        goku.printInfo();
        vegeta.printInfo();
        piccolo.printInfo();
        kami.printInfo();
    }
}
