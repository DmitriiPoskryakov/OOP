public class Cone extends Body {
    private final int radius;
    private final int height;
    private String name = " - конус";

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;

    }

    public double getVolume() {
        return 1.0 / 3 * Math.PI * radius * radius * height;
    }

    public String getName() {
        return name;
    }
}
