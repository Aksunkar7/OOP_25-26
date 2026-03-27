package lab1.task4.apps;

import practice2.Student;
import lab1.task4.models.Course;
import lab1.task4.service.GradeBook;
import java.util.List;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student A = new Student("Aks", 2024);
        Student B = new Student("Dias", 2024);
        Student C = new Student("Danial", 2024);
        Student D = new Student("Dani", 2024);
        Student E = new Student("Danik", 2024);
        Student F = new Student("Daniar", 2025);
        Student G = new Student("Dance", 2024);
        Student H = new Student("Darik", 2024);
        Student I = new Student("Arman", 2024);
        Student J = new Student("Poland", 2024);

        List<Student> students = List.of(A, B, C, D, E, F, G, H, I, J);

        Course cs101 = new Course("OOP", 3, List.of("ads", "db"));
        GradeBook myGradeBook = new GradeBook(cs101, students);



        myGradeBook.displayMessage();

        for (Student s : students) {
            System.out.print("Enter grade for " + s.getName() + " (" + s.getId() + "): ");
            double grade = input.nextDouble();
            while(grade < 0 || grade > 100){
                System.out.print("\nInput valid grade (0-100) for " + s.getName() + " (" + s.getId() + "): ");
                grade = input.nextDouble();
            }
            myGradeBook.setGrade(s, grade);
        }

        myGradeBook.displayGradeReport();
    }
}
