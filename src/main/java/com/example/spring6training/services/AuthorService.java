package com.example.spring6training.services;

import com.example.spring6training.domains.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
