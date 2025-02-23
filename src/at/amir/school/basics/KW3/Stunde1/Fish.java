package at.amir.school.basics.KW3.Stunde1;

public class Fish {
    protected String name;
    protected double size;

    public Fish(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void swim() {
        System.out.println(name + " schwimmt.");
    }

    public void describe() {
        System.out.println(name + " ist " + size + " cm groß.");
    }
}

