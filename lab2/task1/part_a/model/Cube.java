package lab2.task1.part_a.model;

public class Cube extends Shape3D{
    private double a;

    public Cube(double a) {
        this.a = a;
    }
    @Override
    public double volume() {
        return Math.pow(this.a, 3);
    }

    public double surfaceArea() {
        return 6 * Math.pow(this.a, 2);
    }
}
