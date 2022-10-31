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
}
