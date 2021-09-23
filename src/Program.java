import java.util.*;

public class Program {
    public static void main(String[] args) {

        Book book1  = new Book("The Hunger Games",374,"Suzanne Collins", new Date(2008, Calendar.SEPTEMBER,18));
        Book book2  = new Book("The Book Thief",552,"Markus Zusak", new Date(2005, Calendar.SEPTEMBER,1));
        Book book3  = new Book("Twilight",501,"Stephenie Meyer", new Date(2005, Calendar.OCTOBER,5));
        Book book4  = new Book("Animal Farm",141,"George Orwell", new Date(1945, Calendar.AUGUST,17));
        Book book5  = new Book("Les Misérables",1463,"Victor Hugo", new Date(1862, Calendar.JANUARY,1));
        Book book6  = new Book("Fahrenheit 451",194,"Ray Bradbury", new Date(1953, Calendar.OCTOBER,13));
        Book book7  = new Book("The Great Gatsby",200,"F.Scott Fitzgerald", new Date(1925, Calendar.APRIL,10));
        Book book8  = new Book("Life of Pi",460,"Yann Martel", new Date(2001, Calendar.SEPTEMBER,11));
        Book book9  = new Book("The Alchemist",197,"Paulo Coelho", new Date(1988, Calendar.JANUARY,1));
        Book book10 = new Book("Dune",688,"Frank Herbert", new Date(1965, Calendar.JUNE,1));

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        Map<String,String> bookAndAuthorMap = new HashMap<>();

        for (int i=0;i<bookList.stream().map(Book::getName).toArray().length;i++){

            bookAndAuthorMap.put(bookList.stream().map(Book::getName).toArray()[i].toString(),bookList.stream().map(Book::getAuthor).toArray()[i].toString());

        }

        System.out.println("-------------------- | --------------------");
        System.out.printf("%-20s | %20s","BOOK","AUTHOR");
        System.out.printf("\n%-20s | %-20s","--------------------","--------------------");

        for (String key:bookAndAuthorMap.keySet()) {

            System.out.printf("\n%-20s | %20s",key,bookAndAuthorMap.get(key));

        }

        ArrayList<Book> newList = new ArrayList<>();

        for (Object book:bookList.stream().filter(Book -> Book.getPageNumber() > 100).toArray()) {

            newList.add((Book) book);

        }

        System.out.println("\n\n*-*-*-* THE BOOKS WHICH HAS PAGES MORE THAN 100 *-*-*-*");

        for (Book b:newList) {

            System.out.printf("\n-> Book Name: %-20s Pages: %-20s",b.getName(),b.getPageNumber());

        }




    }
}
