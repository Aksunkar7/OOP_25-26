package practice4.task4.app;
import practice4.task4.models.*;
import practice4.task4.services.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aksungkar", 3.82, 1);
        Student s2 = new Student("Almaz", 2.41, 2);

//        Student s3 = s1.

        NameComparator c = new NameComparator();
        System.out.println(s1.getName() + " name is first faces: " + c.compare(s1, s2));
        System.out.println();
        System.out.println(s1.getName() + " has greater gpa: " + s1.compareTo(s2));
        System.out.println();


        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);

        for (Student s: students) {
            System.out.println(s.getName());
        }

        Collections.sort(students); // By gpa
        System.out.println();


        for (Student s: students) {
            System.out.println(s.getName());
        }

        Collections.sort(students, c); // By name
        System.out.println();

        for (Student s: students) {
            System.out.println(s.getName());
        }
    }
}
