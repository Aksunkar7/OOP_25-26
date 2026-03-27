package lab1.task4.service;

import lab1.task4.models.Course;
import practice2.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    
public class GradeBook {
    private Course c;
    private Map<Student, Double> students = new HashMap<>(); 

    // usually we have list of students and by default 0 grades
    public GradeBook(Course c, List<Student> students) {
        this.c = c;
        for (Student s : students) {
            this.students.put(s, 0.0);
        }
    }


    // setter. Here we put grades to students, if no such Student we just add him
    public void setGrade(Student s, double grade) {
        this.students.put(s, grade);
    }
    public void displayMessage(){
        System.out.println("Welcome to our " + c + " course's GradeBook");
    }


    private void determineClassAverage() {
        double avrg = 0; // It doesn't have 0.0 by default
        for(double grade : students.values()) {
            avrg += grade;
        }
        System.out.println(String.format("Class average: %.2f", avrg / (double) students.size() ));
    }

    private void outputBestAndLowest() {
        Student bestStudent = null, worstStudent = null;
        double max = -1, min = 101;

        for (Map.Entry<Student, Double> entry : students.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                bestStudent = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                worstStudent = entry.getKey();
            }
        }
        System.out.println("Best Grade: " + max + " (Holder: " + bestStudent.getName() + ")");
        System.out.println("Lowest Grade: " + min + " (Holder: " + worstStudent.getName() + ")");
    }

    private String toLetterGrade(double grade){
        if(grade >= 95 && grade <= 100) return "A";
        else if(grade >= 90) return "A-";
        else if(grade >= 85) return "B+";
        else if(grade >= 80) return "B";
        else if(grade >= 75) return "B-";
        else if(grade >= 70) return "C+";
        else if(grade >= 65) return "C";
        else if(grade >= 60) return "C-";
        else if(grade >= 55) return "D+";
        else if(grade >= 50) return "D";
        else return "F";
    }

    private void outputBarChart(){

        String[] grades = {"A","A-","B+","B","B-","C+","C","C-","D+","D","F"};
        int[] distribution = new int[grades.length];

        for(double g : students.values()){
            String letter = toLetterGrade(g);

            for(int i = 0; i < grades.length; i++){
                if(grades[i].equals(letter)){
                    distribution[i]++;
                    break;
                }
            }
        }

        System.out.println("\nGrade Distribution:");

        for(int i = 0; i < grades.length; i++){
            System.out.printf("%-3s: ", grades[i]);
            for(int stars = 0; stars < distribution[i]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void displayGradeReport() {
        System.out.println("\n--- Grade Report ---");
        determineClassAverage();
        outputBestAndLowest();
        outputBarChart();
    }

    @Override
    public String toString() {
        return "GradeBook for " + c.toString();
    }
}

