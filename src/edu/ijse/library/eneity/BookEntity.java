/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.eneity;

/**
 *
 * @author malindudulaj
 */
public class BookEntity {
    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private BookCategoryEntity category;
    private int availablecopies;

    public BookEntity(int bookId, String title, String author, String isbn, BookCategoryEntity category, int availablecopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn= isbn;
        this.category = category;
        this.availablecopies = availablecopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getisbn() {
        return isbn;
    }

    public BookCategoryEntity getCategory() {
        return category;
    }

    public int getAvailablecopies() {
        return availablecopies;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCategory(BookCategoryEntity category) {
        this.category = category;
    }

    public void setAvailablecopies(int availablecopies) {
        this.availablecopies = availablecopies;
    }

     
}
