package Collections.ArrayList.Ex4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No hi ha llibres.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book getBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public void updateBookRating(int id, int newRating) {
        Book book = getBookById(id);
        if (book != null) {
            book.setRating(newRating);
        }
    }

    public List<Book> getBooksSortedByRating() {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparingInt(Book::getRating).reversed());
        return sortedBooks;
    }

    public List<Book> getTopNBooks(int N) {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparingInt(Book::getRating).reversed());
        return sortedBooks.subList(0, Math.min(N, sortedBooks.size()));
    }

    public List<Book> getBooksWithRatingGreaterThan(int minRating) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getRating() > minRating) {
                result.add(book);
            }
        }
        return result;
    }

    public void removeBookById(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}