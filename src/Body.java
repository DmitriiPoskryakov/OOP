abstract public class Body extends Geometry {

    public void print() {
        System.out.println("Это тело" + getName() + " с объемом " + getVolume());
    }

    public abstract String getName();

    public abstract double getVolume();

}
