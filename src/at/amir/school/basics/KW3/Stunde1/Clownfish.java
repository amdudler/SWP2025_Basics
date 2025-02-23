package at.amir.school.basics.KW3.Stunde1;

public class Clownfish extends Fish {
    private String colorPattern;

    public Clownfish(String name, double size, String colorPattern) {
        super(name, size);
        this.colorPattern = colorPattern;
    }

    @Override
    public void swim() {
        System.out.println(name + " schwimmt verspielt, wie ein Clownfisch.");
    }
}