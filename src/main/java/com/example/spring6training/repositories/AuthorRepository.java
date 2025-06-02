package com.example.spring6training.repositories;

import com.example.spring6training.domains.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
