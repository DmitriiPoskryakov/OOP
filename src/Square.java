public class Square extends Figure {
    private final int a;
    private String name = " - квадрат";

    public Square(int a) {
        this.a = a;

    }

    public double getArea() {
        return a * a;
    }

    public String getName() {
        return name;
    }

}
