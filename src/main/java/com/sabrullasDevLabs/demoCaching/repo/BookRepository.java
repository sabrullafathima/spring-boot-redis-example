package com.sabrullasDevLabs.demoCaching.repo;

import com.sabrullasDevLabs.demoCaching.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
