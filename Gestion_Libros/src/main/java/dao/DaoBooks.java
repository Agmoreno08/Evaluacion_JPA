// Archivo: dao/BookDAO.java
package dao;

import interfaces.IBooks.LibroRepositoryInterface;
import models.Books;

import java.util.ArrayList;
import java.util.List;

public class DaoBooks implements LibroRepositoryInterface {

    private List<Books> booksList; // Lista para almacenar libros en memoria

    public DaoBooks() {
        this.booksList = new ArrayList<>();
    }

    @Override
    public void CreateBook(Books books) {
        // Asigna un ID único (puedes usar un generador de IDs más robusto)
        books.setId(booksList.size() + 1);
        booksList.add(books);
    }

    @Override
    public List<Books> findAvailableBooks() {
        List<Books> availableBooks = new ArrayList<>();
        for (Books book : booksList) {
            if (book.getDisponible()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    @Override
    public void UpdateBook(Books books) {
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId().equals(books.getId())) {
                booksList.set(i, books);
                return;
            }
        }
    }

    @Override
    public void DeleteBook(Integer id) {
        booksList.removeIf(book -> book.getId().equals(id));
    }

    @Override
    public void markAsUnavailable(Integer id) {
        for (Books book : booksList) {
            if (book.getId().equals(id)) {
                book.setDisponible(false);
                return;
            }
        }
    }
}
