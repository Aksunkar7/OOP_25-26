package lab2.task5.models;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age + ", sound=" + getSound() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal a = (Animal) o;
        return this.age == a.age && this.name.equals(a.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }
}