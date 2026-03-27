package practice4.task4.models;

public class Student implements Comparable<Student>{
    private String name;
    private double gpa;
    private int id;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    public double getGpa() {
        return this.gpa;
    }
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }


}
