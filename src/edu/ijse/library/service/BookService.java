/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service;

import edu.ijse.library.view.Book;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public interface BookService {
    
    List<Book> getAllBooks();

    Book getBookByIsbn(String isbn) throws ServiceException;

    List<Book> searchBooks(String title, String author, String isbn);
    
    void updateBook(Book book) throws ServiceException;
    void saveBook (Book book) throws ServiceException;
    void deleteBook(String isbn) throws ServiceException;

    public static class ServiceException extends Exception {

        public ServiceException() {
        }

        public ServiceException(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
