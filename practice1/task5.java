import java.util.Scanner;

public class task5 {
    public static double new_balance(double balance, double rate){
        return balance + balance * rate / 100;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print init_balance: ");
        double init_balance = sc.nextDouble();
        System.out.println("Print interest of rate (%): ");
        double rate = sc.nextDouble();
        sc.close();

        System.out.println("New balance: " + new_balance(init_balance, rate));

    } 
}
