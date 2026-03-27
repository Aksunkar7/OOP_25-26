package practice4.task2.app;

import practice4.task2.models.*;
import practice4.task2.services.Restaurant;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Cat c = new Cat();
        Restaurant r = new Restaurant();

        r.servePizza(c);
        System.out.println();
        r.servePizza(s);
    }
}
