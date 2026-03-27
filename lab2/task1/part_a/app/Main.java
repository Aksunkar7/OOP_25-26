package lab2.task1.part_a.app;

import lab2.task1.part_a.model.Shape3D;
import lab2.task1.part_a.model.Cube;
import lab2.task1.part_a.model.Cylinder;
import lab2.task1.part_a.model.Sphere;

public class Main {
    public static void main(String[] args) {
        Shape3D cube = new Cube(2);
        Shape3D cylinder = new Cylinder(3, 5);
        Shape3D sphere = new Sphere(4);

        System.out.println("Cube's volume: " + cube.volume() );
        System.out.println("Sphere's surAre: " + sphere.surfaceArea() );
        System.out.println("Cylinder's volume: " + cylinder.volume() );

    }
}
