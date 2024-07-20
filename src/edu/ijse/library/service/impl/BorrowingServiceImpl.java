/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.impl;

import edu.ijse.library.dao.BookDAO;
import edu.ijse.library.dao.BorrowingDAO;
import edu.ijse.library.service.BookService.ServiceException;
import edu.ijse.library.service.BorrowingService;
import edu.ijse.library.view.Borrowing;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public class BorrowingServiceImpl implements BorrowingService {
    
    private final BorrowingDAO borrowingDao;
    private final BookDAO bookDao; // Might be needed for book availability checks

    public BorrowingServiceImpl(BorrowingDao borrowingDao, BookDao bookDao) {
        this.borrowingDao = borrowingDao;
        this.bookDao = bookDao;
    }

    
}
