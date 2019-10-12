package chapter10.db;

import chapter10.domain.Book;

public interface BookRepository {
    void addBook(Book book);

    void updateBook(Book book);

    Book findBook(long bookId);
}
