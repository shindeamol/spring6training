package com.example.spring6training.repositories;

import com.example.spring6training.domains.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
