package popka3.popka31;

import popka2.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Long libraryId, Book book);

    List<Book> getAllBooks(Book libraryId);

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    void clearBooksByLibraryId(Long libraryId);
}
