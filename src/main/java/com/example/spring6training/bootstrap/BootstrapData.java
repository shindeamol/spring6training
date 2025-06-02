package com.example.spring6training.bootstrap;

import com.example.spring6training.domains.Author;
import com.example.spring6training.domains.Book;
import com.example.spring6training.domains.Publisher;
import com.example.spring6training.repositories.AuthorRepository;
import com.example.spring6training.repositories.BookRepository;
import com.example.spring6training.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setFirstName("John");
        author.setLastName("Smith");

        Author author1 = authorRepository.save(author);

        Book book = new Book();
        book.setTitle("Java");
        book.setIsbn("978-3-16-148410-0");

        Book book1 = bookRepository.save(book);

        author1.getBooks().add(book1);

        Publisher publisher = new Publisher();
        publisher.setAddress("San Francisco");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setName("John Smith");
        publisher.setZip("AHKSD");

        Publisher publisher1 = publisherRepository.save(publisher);
        book.setPublisher(publisher1);
        book.getAuthors().add(author1);

        authorRepository.save(author);
        bookRepository.save(book);

        System.out.println("In BootstrapData");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
