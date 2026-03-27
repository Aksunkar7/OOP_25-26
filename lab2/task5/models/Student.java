package lab2.task5.models;

public class Student extends Person {
    private String major;   // extra field

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() { return major; }

    @Override
    public String getOccupation() { return "Student, major: " + major; }
}