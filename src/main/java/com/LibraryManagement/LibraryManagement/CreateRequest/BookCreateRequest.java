package com.LibraryManagement.LibraryManagement.CreateRequest;

import com.LibraryManagement.LibraryManagement.models.Author;
import com.LibraryManagement.LibraryManagement.models.Book;
import com.LibraryManagement.LibraryManagement.models.Genre;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookCreateRequest {

    // Book details
    @NotBlank
    private String name;

    @Positive
    private int cost;

    @NotNull
    private Genre genre;

    // Author details
    @NotBlank
    private String authorName;

    @NotBlank
    @Email
    private String email;


    public Book to() {
        Author author = Author.builder()
                .name(authorName)
                .email(email)
                .build();

        return Book.builder()
                .name(name)
                .genre(genre)
                .myAuthor(author)
                .build();
    }
}
