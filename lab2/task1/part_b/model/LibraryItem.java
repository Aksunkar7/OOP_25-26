package lab2.task1.part_b.model;

public class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public LibraryItem(String title, String author, int publicationYear) {
        this(title, author);
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        if (this.publicationYear != 0) {
            return String.format("Title: %s\nAuthor: %s\nPublication year: %s", this.title, this.author, this.publicationYear);
        }
        return String.format("Title: %s\nAuthor: %s", this.title, this.author);
    }
}
