package com.exterro.entity;

import java.util.Date;

public class BookBorrowedRecord {
    private int id;
    private String bookId;
    private Date borrowDate;
    private Date returnDate;
    // Add more borrow record attributes as needed

    public BookBorrowedRecord(int id, String bookId, Date borrowDate, Date returnDate) {
        this.id = id;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "BookBorrowedRecord [id=" + id + ", bookId=" + bookId + ", borrowDate=" + borrowDate + ", returnDate="
				+ returnDate + "]";
	}
    
    
}