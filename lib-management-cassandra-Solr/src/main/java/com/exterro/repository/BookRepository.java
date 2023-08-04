package com.exterro.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.exterro.entity.Book;

public interface BookRepository extends CassandraRepository<Book, Integer> {
}
