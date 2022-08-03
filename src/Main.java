public class Main {

    public static void main(String[] args) {
        Square sq = new Square(2);
        Triangle tr = new Triangle(3, 4, 5);
        Trapezoid tp = new Trapezoid(4, 2, 2);
        Cube cb = new Cube(2);
        Cylinder cl = new Cylinder(2, 2);
        Cone cn = new Cone(2, 3);
        sq.print();
        tr.print();
        tp.print();
        cb.print();
        cl.print();
        cn.print();

    }

}
