public class Cylinder extends Body {
    private final int radius;
    private final int height;
    private String name = " - цилиндр";

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;

    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public String getName() {
        return name;
    }
}
