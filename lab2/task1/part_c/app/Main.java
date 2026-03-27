package lab2.task1.part_c.app;
import lab2.task1.part_c.models.University;
import lab2.task1.part_c.models.TechnicalUniversity;


public class Main {
    public static void main(String[] args) {
        University uni = new TechnicalUniversity("KBTU", "Almaty", "IT");
        University uni2 = new TechnicalUniversity("KBTU", "Almaty", "IT");

        System.out.println(uni);
        System.out.println(uni2);
        System.out.println();
        System.out.println(uni.equals(uni2));


    }
}
