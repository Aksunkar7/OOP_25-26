import java.util.Scanner;

public class task3 { // Task3
    public static String Grade_in_letter(double  grade){ // gradeInLetter
        if (grade < 0 || grade > 100){
            return "Invalid";
        } 
        else if (grade < 29.5) return "F";
        else if (grade < 49.5) return "FX";
        else if (grade < 54.5) return "D";
        else if (grade < 59.5) return "D+";
        else if (grade < 64.5) return "C-";
        else if (grade < 69.5) return "C";
        else if (grade < 74.5) return "C+";
        else if (grade < 79.5) return "B-";
        else if (grade < 84.5) return "B";
        else if (grade < 89.5) return "B+";
        else if (grade < 94.5) return "A-";
        else return "A";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your grade: ");
        double grade = sc.nextDouble();
        sc.close();
        System.out.println("Your grade in letter: " + Grade_in_letter(grade));
    }
}
