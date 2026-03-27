package lab1.task5.service;

import lab1.task5.models.Gender;
import lab1.task5.models.Person;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople = new Vector<>();

    public void kidnap(Person p) {
        this.kidnappedPeople.addElement(p);
    }

    public boolean willDragonEatOrNot() {
        int boys_waited = 0;

        for(Person p : kidnappedPeople) {
            if(p.getGender() == Gender.BOY) boys_waited++;
            else {
                if (boys_waited == 0) return true; // if there is no boys and leaves girl and dragon eats her
                boys_waited--;
            }
        }
        return boys_waited > 0; // if leaves boy(s)
    }
}
