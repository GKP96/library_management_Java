package com.LibraryManagement.LibraryManagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.LibraryManagement.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
