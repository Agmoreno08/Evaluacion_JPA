// Archivo: Main.java
import dao.DaoBooks;
import models.Books;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaoBooks bookDAO = new DaoBooks();

        // Crear libros
        bookDAO.CreateBook(new Books("Gabriel García Márquez", "Cien años de soledad", 1967, true));
        bookDAO.CreateBook(new Books("J.K. Rowling", "Harry Potter y la piedra filosofal", 1997, true));
        bookDAO.CreateBook(new Books("George Orwell", "1984", 1949, true));

        // Listar libros disponibles
        System.out.println("Libros disponibles:");
        List<Books> availableBooks = bookDAO.findAvailableBooks();
        for (Books book : availableBooks) {
            System.out.println(book);
        }

        // Marcar un libro como no disponible
        bookDAO.markAsUnavailable(1); // Marca el libro con ID 1 como no disponible

        // Listar libros disponibles nuevamente
        System.out.println("\nLibros disponibles después de marcar uno como no disponible:");
        availableBooks = bookDAO.findAvailableBooks();
        for (Books book : availableBooks) {
            System.out.println(book);
        }

        // Actualizar un libro
        Books updatedBook = new Books("Gabriel García Márquez", "Cien años de soledad", 1967, true);
        updatedBook.setId(1); // Asignar el mismo ID
        bookDAO.UpdateBook(updatedBook);

        // Listar todos los libros
        System.out.println("\nTodos los libros:");
        for (Books book : bookDAO.findAvailableBooks()) {
            System.out.println(book);
        }

        // Eliminar un libro
        bookDAO.DeleteBook(2); // Eliminar el libro con ID 2
        System.out.println("\nLibros después de eliminar uno:");
        for (Books book : bookDAO.findAvailableBooks()) {
            System.out.println(book);
        }
    }
}
