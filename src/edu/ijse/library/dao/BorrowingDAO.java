/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao;

import java.util.List;

/**
 *
 * @author malindudulaj
 */
public interface BorrowingDAO {
    Borrowing create(Borrowing borrowing);
    Borrowing read(int borrowingId);
    List<Borrowing> readAll();
    Borrowing update(Borrowing borrowing);
    void delete(int borrowingId);

    
}
