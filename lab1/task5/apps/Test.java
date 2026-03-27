package lab1.task5.apps;

import lab1.task5.service.DragonLaunch;
import lab1.task5.models.Person;
import lab1.task5.models.Gender;

public class Test {
    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();
        Person a = new Person("Aksungkar", Gender.BOY);
        System.out.println(a);
        System.out.println(a.getName() + "'s gender: " + a.getGender());
        // Тест 1: B G B G -> Должно быть false (никто не остался)
        dl.kidnap(a);
        dl.kidnap(new Person("Arman", Gender.BOY));
        dl.kidnap(new Person("Gulim", Gender.GIRL));
        dl.kidnap(new Person("Dias", Gender.BOY));

        System.out.println("Will dragon eat? " + dl.willDragonEatOrNot());
    }
}
