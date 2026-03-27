package practice4.task2.services;

import practice4.task2.models.CanHavePizza;
import practice4.task2.models.Person;

public class Restaurant {
    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
            System.out.println("Person is paying for pizza");
        }
        return true;
    }
}
