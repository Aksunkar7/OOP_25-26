import java.util.Scanner;

public class Task2 {

    public static double diameter(int a) {
        return a * Math.sqrt(2);
    }

    public static int perimeter(int a) {
        return a * 4;
    }

    public static int area(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        int area = a * a;
        int p = 4 * a;
        double d = a * Math.sqrt(2);

        System.out.println("Area: " + Task2.area(a));
        System.out.println("Perimeter: " + Task2.perimeter(a));
        System.out.println("Diameter: " + Task2.diameter(a));
    }
}
