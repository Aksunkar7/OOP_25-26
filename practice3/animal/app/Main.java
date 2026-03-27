package practice3.animal.app;

import practice3.animal.model.Animal;
import practice3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Bear", 2);
        Animal d = new Dog("Barsik", 2, "Tobet");
        Animal d2 = new Dog("Aktos", 4, "Alabay");

        Dog f = (Dog) d;

        List<Animal> animals = new ArrayList<>();
        animals = List.of(a, d, d2);



        for(Animal an : animals) {
            an.makeSound();
            an.getInfo();
            an.eat();
            if(an instanceof Dog) {
                an.eat("as atasy nan");
            }
            System.out.println();
        }


    }
}
