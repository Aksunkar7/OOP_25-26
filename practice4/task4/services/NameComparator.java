package practice4.task4.services;

import practice4.task4.models.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s, Student s1) {
        return s.getName().compareTo(s1.getName());
    }
}
