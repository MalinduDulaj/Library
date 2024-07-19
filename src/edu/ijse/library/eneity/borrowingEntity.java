/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.eneity;

import java.util.Date;

/**
 *
 * @author malindudulaj
 */
public class borrowingEntity {
    private int transactionId;
    private MemberEntity memberId;     // Assuming a many-to-one relationship
    private BookEntity bookId;   //Assuming a many-to-one relationship
    private Date issuedate;
    private Date duedate;
    private Date returndate;
    private double fine;

    public borrowingEntity(int transactionId, MemberEntity memberId, BookEntity bookId, Date issuedate, Date duedate, Date returndate, double fine) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.issuedate = issuedate;
        this.duedate = duedate;
        this.returndate = returndate;
        this.fine = fine;
    }

    /**
     * @return the transactionId
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return the memberId
     */
    public MemberEntity getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(MemberEntity memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the bookId
     */
    public BookEntity getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(BookEntity bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the issuedate
     */
    public Date getIssuedate() {
        return issuedate;
    }

    /**
     * @param issuedate the issuedate to set
     */
    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    /**
     * @return the duedate
     */
    public Date getDuedate() {
        return duedate;
    }

    /**
     * @param duedate the duedate to set
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
     * @return the returndate
     */
    public Date getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the returndate to set
     */
    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    /**
     * @return the fine
     */
    public double getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(double fine) {
        this.fine = fine;
    }
    
    
    
    
}
