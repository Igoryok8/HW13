public class Main {

    public static void main(String[] args) {

        System.out.println("Домашнее задание 13");
        System.out.println();
        System.out.println("1.");


        Book book = new Book("Мастер и Маргарита","Михаил Булгаков",1966);
        System.out.println("book.nameBook = " + book.nameBook);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearIssue = " + book.yearIssue);
        Book book1 = new Book("Преступление и наказание","Фёдор Достоевский",1866);
        System.out.println();
        System.out.println("2.");
        Author author = new Author("Михаил","Булгаков");
        System.out.println("author.firstName = " + author.firstName);
        System.out.println("author.lastName = " + author.lastName);
        Author author1 = new Author("Фёдор","Достоевский");
    }

}