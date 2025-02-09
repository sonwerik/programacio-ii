package Collections.ArrayList.Ex4;

public class TestBookManager {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book1 = new Book(1, "La caverna", "Plató", 5);
        Book book2 = new Book(2, "L'Odissea", "Homèr", 4);
        Book book3 = new Book(3, "1984", "George Orwell", 5);
        Book book4 = new Book(4, "Don Quixot", "Miguel de Cervantes", 3);
        Book book5 = new Book(5, "Matar un rossinyol", "Harper Lee", 4);

        bookManager.addBook(book1);
        bookManager.addBook(book2);
        bookManager.addBook(book3);
        bookManager.addBook(book4);
        bookManager.addBook(book5);

        System.out.println("Tots els llibres:");
        bookManager.showAllBooks();

        System.out.println("\nLlibre amb títol '1984':");
        System.out.println(bookManager.getBookByTitle("1984"));

        System.out.println("\nLlibre de l'autor 'Miguel de Cervantes':");
        System.out.println(bookManager.getBookByAuthor("Miguel de Cervantes"));

        bookManager.updateBookRating(4, 4);
        System.out.println("\nValoració actualitzada per 'Don Quixot':");
        System.out.println(bookManager.getBookById(4));

        System.out.println("\nLlibres ordenats per valoració:");
        for (Book book : bookManager.getBooksSortedByRating()) {
            System.out.println(book);
        }

        System.out.println("\nMillors 3 llibres:");
        for (Book book : bookManager.getTopNBooks(3)) {
            System.out.println(book);
        }

        System.out.println("\nLlibres amb valoració superior a 3:");
        for (Book book : bookManager.getBooksWithRatingGreaterThan(3)) {
            System.out.println(book);
        }

        bookManager.removeBookById(2);
        System.out.println("\nLlibres després d'eliminar el llibre amb id 2:");
        bookManager.showAllBooks();
    }
}