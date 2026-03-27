package lab2.task5.app;

import lab2.task5.services.*;
import lab2.task5.models.*;

public class PetTest {
    public static void main(String[] args) {

        Person john  = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");

        Animal murka = new Cat("Murka", 5);

        PetAssignmentService assignmentService = new PetAssignmentService();
        VacationService vacationService        = new VacationService();
        PersonRegistryService registry         = new PersonRegistryService();

        assignmentService.assign(john, murka);

        registry.addPerson(john);
        registry.addPerson(alice);

        vacationService.leavePetWith(john, alice);
        System.out.println(registry);

        vacationService.retrievePetFrom(john, alice);
        System.out.println(registry);
    }
}