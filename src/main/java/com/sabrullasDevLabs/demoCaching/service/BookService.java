package com.sabrullasDevLabs.demoCaching.service;

import com.sabrullasDevLabs.demoCaching.model.Book;
import com.sabrullasDevLabs.demoCaching.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Cacheable(value = "books", key = "#id")
    public Book getBookById(Long id) {
        // Simulate delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
        return bookRepository.findById(id).orElse(null);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }
}

