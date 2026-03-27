package lab2.task1.part_a.model;

public class Cylinder extends Shape3D{
    private double radius, height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public double surfaceArea(){
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

}
