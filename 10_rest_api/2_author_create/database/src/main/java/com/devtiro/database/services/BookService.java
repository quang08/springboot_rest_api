package com.devtiro.database.services;

import com.devtiro.database.domain.entities.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void deleteBook(String isbn);

    BookEntity createUpdateBook(String isbn, BookEntity bookEntity);

    List<BookEntity> findAll();

    Optional<BookEntity> findOne(String isbn);

    boolean ifExists(String isbn);


    BookEntity partialUpdateBook(String isbn, BookEntity bookEntity);
}
