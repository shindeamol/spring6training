package com.example.spring6training.repositories;

import com.example.spring6training.domains.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
