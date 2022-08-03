public class Triangle extends Figure {
    private final int a;
    private final int b;
    private final int c;
    private String name = " - треугольник";

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String getName() {
        return name;
    }

    public double getArea() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
