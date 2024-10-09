package interfaces;

import models.Books;

import java.util.List;

import models.Books;
import java.util.List;

public interface IBooks {

    public interface LibroRepositoryInterface {
        void CreateBook(Books books);
        List<Books> findAvailableBooks();
        void UpdateBook(Books books);
        void DeleteBook(Integer id);
        void markAsUnavailable(Integer id);
    }
}