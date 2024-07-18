/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao;

import java.awt.print.Book;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public interface BookDAO {
   
    Book create(Book book);
    Book read(int bookId);
    List<Book> readAll();
    Book update(Book book);
    void delete(int bookId);
}
    

