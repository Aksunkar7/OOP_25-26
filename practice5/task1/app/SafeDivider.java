package practice5.task1.app;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter first integer: ");
                int x1 = Integer.parseInt((sc.nextLine()));

                System.out.println("Enter second integer: ");
                int x2 = Integer.parseInt((sc.nextLine()));

                int result = x1 / x2;
                System.out.println("Result: " + x1 + " / " + x2 + " = " + result);
                break;
            } catch(ArithmeticException e) {
                System.out.println("Error: Division by zero. Please try again.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter integers only.");
            }
        }
        sc.close();
    }
}
