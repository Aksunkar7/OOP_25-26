package lab2.task1.part_b.model;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }
    public Book(String title, String author, int year, int numberOfPages) {
        super(title, author, year);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNumber of pages: %s", this.numberOfPages);
    }


}
