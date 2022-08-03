public class Trapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int height;
    private String name = " - трапеция";

    public Trapezoid(int base1, int base2, int height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 0.5 * height * (base1 + base2);
    }
}
