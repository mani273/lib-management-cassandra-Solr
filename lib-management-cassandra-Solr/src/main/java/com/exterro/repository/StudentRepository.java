package com.exterro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exterro.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom queries (if needed)
}
