package com.exterro.databases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.exterro.entity.BookBorrowedRecord;

@Repository
public class BorrowedBooksDatabase {
    private static final String CASSANDRA_HOST = "127.0.0.1";
    private static final int CASSANDRA_PORT = 9042;

    private Cluster cluster;
    private Session session;

    public void connect() {
        cluster = Cluster.builder()
                .addContactPoint(CASSANDRA_HOST)
                .withPort(CASSANDRA_PORT)
                .build();
        session = cluster.connect("student");
    }

    public void close() {
        session.close();
        cluster.close();
    }

    public void borrowBook(int userId, String bookId, Date borrowDate) {
        // Implement code to insert book borrowing record into Cassandra
    }

    public void returnBook(int userId, String bookId, Date returnDate) {
        // Implement code to update book borrowing record in Cassandra with return date
    }

    public List<BookBorrowedRecord> getUserBorrowHistory(int userId) {
        List<BookBorrowedRecord> history = new ArrayList<>();
        // Implement code to retrieve borrowing history from Cassandra based on user ID
        return history;
    }
}