public class Task1 {

    private static void a(int l) {
        System.out.print("+");
        for (int i = 0; i < l; ++i){
            System.out.print("-");
        }
        System.out.println("+");

    }
    public static void printNameLine(String name) {
        int len = name.length();
        a(len);
        System.out.println("|" + name + "|");
        a(len);

        }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // sc.close();

        // Task1.printNameLine(name);
        System.out.println(2024%100);
    }
}
