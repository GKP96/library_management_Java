package com.LibraryManagement.LibraryManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryManagement.LibraryManagement.models.Author;
import com.LibraryManagement.LibraryManagement.models.Book;
import com.LibraryManagement.LibraryManagement.repos.BookRepository;


@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorService authorService;

    public void createBook(Book book){
        //TODO: We need to write the logic for author insertion

        Author author = authorService.createOrGetAuthor(book.getMyAuthor());
        book.setMyAuthor(author);
        bookRepository.save(book);
    }

    public Book getBookById(int id){
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

}

/**
 * Complete the book and author flow
 * Create transactions --> Issue and Return
 * Custom queries --> Filtered get books API
 */
