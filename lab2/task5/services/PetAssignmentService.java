package lab2.task5.services;

import lab2.task5.models.Animal;
import lab2.task5.models.Person;

public class PetAssignmentService {

    public void assign(Person owner, Animal pet) {
        if (pet == null)
            throw new IllegalArgumentException("Pet cannot be null.");
        if (owner.hasPet())
            throw new IllegalStateException(owner.getName() + " already has a pet.");
        owner.assignPet(pet); // canHavePet() проверяется внутри
    }

    public void remove(Person owner) {
        if (!owner.hasPet())
            throw new IllegalStateException(owner.getName() + " has no pet to remove.");
        owner.removePet();
    }
}