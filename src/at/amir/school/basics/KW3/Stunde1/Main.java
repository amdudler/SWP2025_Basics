package at.amir.school.basics.KW3.Stunde1;

public class Main {
    public static void main(String[] args) {
        Fish goldfish = new Fish("Goldfisch", 10);
        Shark whiteShark = new Shark("Weißer Hai", 300, 50);
        Clownfish nemo = new Clownfish("Nemo", 15, "Orange mit weißen Streifen");

        goldfish.swim();
        whiteShark.swim();
        nemo.swim();

        goldfish.describe();
        whiteShark.describe();
        nemo.describe();

        whiteShark.describe("Größter Raubfisch der Welt, sehr aggressiv und kann gefährlich werden.");
    }
}
