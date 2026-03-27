package lab1.task5.models;

public class Person {
    private String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return String.format("Person name: %s, gender: %s", this.name, this.gender);
    }
}
