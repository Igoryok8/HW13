public class Book {
    private String nameBook;
    private String authorName;
    private int yearIssue;

    public Book(String nameBook, String authorName, int yearIssue) {
        this.nameBook = nameBook;
        this.authorName = authorName;
        this.yearIssue = yearIssue;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public int getYearIssue() {
        return this.yearIssue;
    }
}

