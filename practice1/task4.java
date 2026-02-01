import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        sc.close();

        if (a == 0) {
            System.out.println("a cannot be zero (not a quadratic equation)");
            return;
        }

        double D = b * b - 4 * a * c;   

        if (D < 0) {
            System.out.println("Discriminant is negative, no real roots.");
        } 
        else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("One root: x = " + x);
        } 
        else {
            double sqrtD = Math.sqrt(D);  
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("Two roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
