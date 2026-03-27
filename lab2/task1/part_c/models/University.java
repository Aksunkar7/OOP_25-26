package lab2.task1.part_c.models;

import java.util.Objects;

public class University {
    private String name;
    private String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if (o == null || getClass() != o.getClass()) return false;

        University uni = (University) o;
        return Objects.equals(this.location, uni.location) &&
                Objects.equals(this.name, uni.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.location, this.name);
    }
    @Override
    public  String toString() {
        return String.format("Uni name: %s\nUni location: %S", this.name, this.location);
    }


}
