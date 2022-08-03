public abstract class Figure extends Geometry {

    public void print() {
        System.out.println("Это фигура" + getName() + " с площадью " + getArea());
    }

    public abstract String getName();

    public abstract double getArea();

}
