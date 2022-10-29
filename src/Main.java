public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание 13");
        System.out.println();
        Author author = new Author("Михаил","Булгаков");
        System.out.println("author.firstName = " + author.getFirstName());
        System.out.println("author.lastName = " + author.getLastName());
        System.out.println();
        Author author1 = new Author("Фёдор","Достоевский");
        System.out.println("author1.firstName = " + author1.getFirstName());
        System.out.println("author1.lastName = " + author1.getLastName());
        System.out.println();
        Book book = new Book("Мастер и Маргарита",author,1966);
        System.out.println("book.nameBook = " + book.getNameBook());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.yearIssue = " + book.getYearIssue());
        book.setYearIssue(1967);
        System.out.println("book.getYearIssue() = " + book.getYearIssue());
        System.out.println();
        Book book1 = new Book("Преступление и наказание",author1,1866);
        System.out.println();
        System.out.println("book1.nameBook = " + book1.getNameBook());
        System.out.println("book1.author1 = " + book1.getAuthor());
        System.out.println("book1.yearIssue = " + book1.getYearIssue());
        System.out.println();

    }

}