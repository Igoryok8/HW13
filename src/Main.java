public class Main {

    public static void main(String[] args) {

        System.out.println("Домашнее задание 13");
        System.out.println();
        System.out.println("1.");

        Book book = new Book("Мастер и Маргарита","Михаил Булгаков",1966);
        System.out.println("book.nameBook = " + book.getNameBook());
        System.out.println("book.authorName = " + book.getAuthorName());
        System.out.println("book.yearIssue = " + book.getYearIssue());
        Book book1 = new Book("Преступление и наказание","Фёдор Достоевский",1866);
        System.out.println();

        System.out.println("2.");
        Author author = new Author("Михаил","Булгаков");
        System.out.println("author.firstName = " + author.getFirstName());
        System.out.println("author.lastName = " + author.getLastName());
        Author author1 = new Author("Фёдор","Достоевский");
        System.out.println();

    }

}