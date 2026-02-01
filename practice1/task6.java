import java.util.Scanner;

public class task6 {
    public static boolean is_palindrome(String s) {
        String reversed_s= "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed_s += s.charAt(i);
        }
        
        return s.equals(reversed_s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        if (is_palindrome(s)){
            System.out.println("This is palindrome");
        }        
        else {
            System.out.println("This is not palindrome");
        }
    }
}
