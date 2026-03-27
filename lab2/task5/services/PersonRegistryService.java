package lab2.task5.services;

import lab2.task5.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRegistryService {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        if (p == null) throw new IllegalArgumentException("Person cannot be null.");
        people.add(p);
    }

    public void removePerson(Person p) { people.remove(p); }

    public List<Person> findWithPet() {
        return people.stream().filter(Person::hasPet).collect(Collectors.toList());
    }

    public List<Person> findWithoutPet() {
        return people.stream().filter(p -> !p.hasPet()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== PersonRegistry ===\n");
        for (Person p : people) sb.append("  ").append(p).append("\n");
        return sb.toString();
    }
}