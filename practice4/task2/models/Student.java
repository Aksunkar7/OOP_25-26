package practice4.task2.models;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable, Dancable{
    @Override
    public void eatPizza() {
        System.out.println("Student is eating pizza");
    }

    @Override
    public void retakeExam() {
        System.out.println("Student is retaking exam");
    }
    @Override
    public void move() {
        System.out.println("Student is moving");
    }

    @Override
    public void dance() {
        System.out.println("Student is dancing");
    }


}
