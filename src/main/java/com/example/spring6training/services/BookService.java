package com.example.spring6training.services;

import com.example.spring6training.domains.Book;

public interface BookService {
    Iterable<Book> findAll();
}
