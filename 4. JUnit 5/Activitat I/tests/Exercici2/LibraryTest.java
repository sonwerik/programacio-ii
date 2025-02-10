package Exercici2;

import Exercici2.Book;
import Exercici2.Library;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void addBook() {
        Library library = new Library();
        Book book = new Book("The Half-Blood Prince", "J. K. Rowling");
        library.addBook(book);
        List<Book> books = library.getBooks();
        assertEquals(1, books.size());
        assertEquals("The Half-Blood Prince", books.getFirst().getTitle());
    }

    @Test
    void removeBook() {
        Library library = new Library();
        Book book = new Book("The Half-Blood Prince", "J. K. Rowling");
        library.addBook(book);
        assertTrue(library.removeBook("The Half-Blood Prince"));
        assertFalse(library.removeBook("Nonexistent Book"));
    }

    @Test
    void findBook() {
        Library library = new Library();
        Book book1 = new Book("The Half-Blood Prince", "J. K. Rowling");
        library.addBook(book1);
        Book foundbook = library.findBook("The Half-Blood Prince");
        assertNotNull(foundbook);
        assertEquals("The Half-Blood Prince", foundbook.getTitle());
        assertNull(library.findBook("Nonexistent Book"));
    }

    @Test
    void getBooks() {
        Library library = new Library();
        Book harryPotter1 =  new Book ("Harry Potter and the Sorcerer's Stone", "J. K. Rowling");
        Book harryPotter2 =  new Book ("Harry Potter and the Chamber of Secrets", "J. K. Rowling");
        Book harryPotter3 =  new Book ("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling");
        Book harryPotter4 =  new Book ("Harry Potter and the Goblet of Fire", "J. K. Rowling");
        Book harryPotter5 =  new Book ("Harry Potter and the Order of the Phoenix", "J. K. Rowling");
        Book harryPotter6 =  new Book ("Harry Potter and the Half-Blood Prince", "J. K. Rowling");
        Book harryPotter7 =  new Book ("Harry Potter and the Deathly Hallows", "J. K. Rowling");
        library.addBook(harryPotter1);
        library.addBook(harryPotter2);
        library.addBook(harryPotter3);
        library.addBook(harryPotter4);
        library.addBook(harryPotter5);
        library.addBook(harryPotter6);
        library.addBook(harryPotter7);
        List<Book> books = library.getBooks();
        assertEquals(7, books.size());
        assertEquals("Harry Potter and the Sorcerer's Stone", books.get(0).getTitle());
        assertEquals("Harry Potter and the Chamber of Secrets", books.get(1).getTitle());
        assertEquals("Harry Potter and the Prisoner of Azkaban", books.get(2).getTitle());
        assertEquals("Harry Potter and the Goblet of Fire", books.get(3).getTitle());
        assertEquals("Harry Potter and the Order of the Phoenix", books.get(4).getTitle());
        assertEquals("Harry Potter and the Half-Blood Prince", books.get(5).getTitle());
        assertEquals("Harry Potter and the Deathly Hallows", books.get(6).getTitle());
    }
}