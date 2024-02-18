package com.LibraryManagement.LibraryManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryManagement.LibraryManagement.models.Author;
import com.LibraryManagement.LibraryManagement.repos.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    // This function will be responsible to return an author with given email
    // if it already or else it will create a new author
    public Author createOrGetAuthor(Author author){

        Author authorFromDB = authorRepository.findAuthor(author.getEmail());

        if(authorFromDB == null){
            authorFromDB = authorRepository.save(author);
        }

        return authorFromDB;
    }
}
