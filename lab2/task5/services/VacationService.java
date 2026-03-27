package lab2.task5.services;

import lab2.task5.models.Person;

public class VacationService {

    public void leavePetWith(Person owner, Person caretaker) {
        if (!owner.hasPet())
            throw new IllegalStateException(
                    owner.getName() + " has no pet to leave.");
        if (caretaker.hasPet())
            throw new IllegalStateException(
                    caretaker.getName() + " already has a pet and cannot take another.");

        caretaker.assignPet(owner.getPet());
        owner.removePet();
    }

    public void retrievePetFrom(Person owner, Person caretaker) {
        if (!caretaker.hasPet())
            throw new IllegalStateException(
                    caretaker.getName() + " has no pet to return.");
        if (owner.hasPet())
            throw new IllegalStateException(
                    owner.getName() + " already has a pet.");

        owner.assignPet(caretaker.getPet());
        caretaker.removePet();
    }
}