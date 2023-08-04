package com.exterro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.exterro.entity.Book;
import com.exterro.repository.BookRepository;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

@RestController
public class CassandraController {

    private final BookRepository bookRepository;

    @Autowired
    public CassandraController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/saveBook")
    public String saveBook(
            @RequestParam int sNo,
            @RequestParam String author,
            @RequestParam String bookName,
            @RequestParam int year,
            @CookieValue(value = "student_id", required = false) String studentId,
            @CookieValue(value = "student_name", required = false) String studentName)
     {
        Book book = new Book();
        book.setBookid(sNo);
        book.setBookname(bookName);
        book.setTime(Instant.now());
        book.setDate(LocalDate.now(ZoneOffset.UTC));

        if (studentId != null) {
            book.setStudid(studentId);
        }	

        if (studentName != null) {
            book.setStudname(studentName);
        }

        bookRepository.save(book);

        return "Book saved successfully!";
    }
}
