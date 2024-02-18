package com.LibraryManagement.LibraryManagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.LibraryManagement.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
