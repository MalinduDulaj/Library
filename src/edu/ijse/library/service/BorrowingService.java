/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service;

import edu.ijse.library.service.BookService.ServiceException;
import edu.ijse.library.view.Book;
import edu.ijse.library.view.Borrowing;
import edu.ijse.library.view.Member;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public interface BorrowingService {
    
    List<Borrowing> getAllBorrowings();

    Borrowing getBorrowingById(int memberId) throws ServiceException;

    List<Borrowing> searchBorrowings(int memberId,int bookId);

    
    void searchBook(Book bookId) throws ServiceException;

    void searchMember(Member member) throws ServiceException;
}

