/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.impl;

/**
 *
 * @author malindudulaj
 */
public class BorrowingDAOImpl implements BorrowingDAO {
    
    private Connection connection;

    public BorrowingDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Borrowing create(Borrowing borrowing) {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO Borrowing (member_id, book_id, issue_date, due_date, return_date, fine) VALUES (?, ?, ?, ?, ?, ?)")) {
            statement.setInt(1, borrowing.getMember().getMemberId());
            statement.setInt(2, borrowing.getBook().getBookId());
            statement.setDate(3, new java.sql.Date(borrowing.getIssueDate().getTime()));
            statement.setDate(4, new java.sql.Date(borrowing.getDueDate().getTime()));
            statement.setDate(5, borrowing.getReturnDate() != null ? new java.sql.Date(borrowing.getReturnDate().getTime()) : null);
            statement.setDouble(6, borrowing.getFine());
            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                borrowing.
}
