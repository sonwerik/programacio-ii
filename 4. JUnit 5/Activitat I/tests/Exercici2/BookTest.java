package Exercici2;

import Exercici2.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void constructor() {
        Book book = new Book ("The Half-Blood Prince", "J. K. Rowling");
        assertEquals("The Half-Blood Prince", book.getTitle());
        assertEquals("J. K. Rowling", book.getAuthor());
        assertFalse(book.isBorrowed());
    }

    @Test
    void borrowTrue() {
        Book book = new Book ("The Half-Blood Prince", "J. K. Rowling");
        book.borrow();
        assertTrue(book.isBorrowed());
        assertThrows(IllegalStateException.class, book::borrow);
    }

    @Test
    void returnBook() {
        Book book = new Book ("The Half-Blood Prince", "J. K. Rowling");
        book.borrow();
        book.returnBook();
        assertFalse(book.isBorrowed());
        assertThrows(IllegalStateException.class, book::returnBook);
    }

    @Test
    void testToString() {
        Book book = new Book ("The Half-Blood Prince", "J. K. Rowling");
        assertEquals("The Half-Blood Prince by J. K. Rowling (Available)", book.toString());
        book.borrow();
        assertEquals("The Half-Blood Prince by J. K. Rowling (Borrowed)", book.toString());

    }
}