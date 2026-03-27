package lab2.task1.part_b.app;

import lab2.task1.part_b.model.LibraryItem;
import lab2.task1.part_b.model.Book;

public class Main {
    public static void main(String[] args) {
        LibraryItem b = new Book("Ulpan", "Musirepov", 2005, 256);
        System.out.println(b);
        System.out.println();
        System.out.println(b.getAuthor());
        System.out.println(b.getPublicationYear());
        b.setAuthor("Abay");
        System.out.println(b.getAuthor());



    }
}
