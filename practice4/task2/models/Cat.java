package practice4.task2.models;

public class Cat implements CanHavePizza{
    @Override
    public void eatPizza() {
        System.out.println("Cat is eating pizza");
    }
}

