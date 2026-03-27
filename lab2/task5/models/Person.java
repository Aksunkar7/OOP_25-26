package lab2.task5.models;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public String getName() { return name; }
    public int getAge()     { return age; }
    public Animal getPet()  { return pet; }

    public void assignPet(Animal pet) {
        if (pet == null) throw new IllegalArgumentException("Pet cannot be null.");
        if (!canHavePet(pet))
            throw new IllegalArgumentException(
                    getName() + " cannot have a " + pet.getClass().getSimpleName() + ".");
        this.pet = pet;
    }

    public void removePet() { this.pet = null; }

    public boolean hasPet() { return pet != null; }

    protected boolean canHavePet(Animal pet) { return true; }

    public abstract String getOccupation();


    @Override
    public String toString() {
        String petInfo = hasPet() ? ", pet=" + pet : ", no pet";
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age
                + ", occupation=" + getOccupation() + petInfo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return age == p.age && name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }
}