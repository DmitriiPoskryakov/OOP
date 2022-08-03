public class Cube extends Body {
    private final int a;
    private String name = " - куб";

    public Cube(int a) {
        this.a = a;
    }

    public double getVolume() {
        return a * a * a;
    }

    public String getName() {
        return name;
    }
}
