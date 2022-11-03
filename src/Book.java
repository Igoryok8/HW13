import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author author;
    private int yearIssue;

    public Book(String nameBook, Author author, int yearIssue) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearIssue = yearIssue;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearIssue() {
        return this.yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearIssue == book.yearIssue && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearIssue);
    }

    @Override
    public String toString() {
        return nameBook + " " + author.toString()+ " " + yearIssue;
    }
}
