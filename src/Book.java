public class Book {
    private String nameBook;
    private String author;
    private int yearIssue;

    public Book(String nameBook, String author, int yearIssue) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearIssue = yearIssue;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearIssue() {
        return this.yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }
}

