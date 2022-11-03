public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 13");
        System.out.println();
        Author author = new Author("Михаил","Булгаков");
        Book book = new Book("Мастер и Маргарита",author,1966);
        Book book1 = new Book("Преступление и наказание",new Author("Фёдор","Достоевский"),1866);
        book.setYearIssue(1967);
        System.out.println(book.getYearIssue());

        System.out.println("Авторы:");
        Author mikhailBulgakov = new Author("Михаил","Булгаков");
        Author mikhailBulgakov1 = new Author("Михаил","Булгаков");
        Author fyodorDostoevsky = new Author("Фёдор","Достоевский");
        System.out.println("Author copies equal: "+ mikhailBulgakov.equals(mikhailBulgakov1));
        System.out.println("Author copies equal by hashCode: " + (mikhailBulgakov.hashCode()==mikhailBulgakov1.hashCode()) );
        System.out.println("Author equal: "+ mikhailBulgakov.equals(fyodorDostoevsky));
        System.out.println("Author equal by hashCode: " + (mikhailBulgakov.hashCode()==fyodorDostoevsky.hashCode()));

        System.out.println(mikhailBulgakov);
        System.out.println(fyodorDostoevsky);

        System.out.println("__________________________");

        System.out.println("Книги:");
        Book theMasterAndMargarita = new Book("Мастер и Маргарита",mikhailBulgakov,1966);
        Book theMasterAndMargarita1 = new Book("Мастер и Маргарита",mikhailBulgakov,1966);
        Book crimeAndPunishment = new Book("Преступление и наказание",fyodorDostoevsky,1866);
        System.out.println("Book copies equal: "+ theMasterAndMargarita.equals(theMasterAndMargarita1));
        System.out.println("Book copies equal by hashCode: " + (theMasterAndMargarita.hashCode()==theMasterAndMargarita1.hashCode()) );
        System.out.println("Book equal: "+ theMasterAndMargarita.equals(crimeAndPunishment));
        System.out.println("Author equal by hashCode: " + (theMasterAndMargarita.hashCode()==crimeAndPunishment.hashCode()));
        System.out.println(theMasterAndMargarita);
        System.out.println(crimeAndPunishment);

    }
}