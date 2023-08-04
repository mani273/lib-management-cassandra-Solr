package com.exterro.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant; // Import the correct Instant class
import java.time.LocalDate;

@Table("details")
public class Book {

    @Id
    @PrimaryKey
    private int bookid;

    @Column("bookname")
    private String bookname;

    @Column("time")
    private Instant time; // Use Instant instead of Date

    @Column("date")
    private LocalDate date;

    @Column("studid")
    private String studid;
    
    @Column("studname")
    private String studname;

	public Book() {

	}

	public Book(int bookid, String bookname, Instant time, LocalDate date, String studid, String studname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.time = time;
		this.date = date;
		this.studid = studid;
		this.studname = studname;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Instant getTime() {
		return time;
	}

	public void setTime(Instant time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStudid() {
		return studid;
	}

	public void setStudid(String studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", time=" + time + ", date=" + date + ", studid="
				+ studid + ", studname=" + studname + "]";
	}

    
}
