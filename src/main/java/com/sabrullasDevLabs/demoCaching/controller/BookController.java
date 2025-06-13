package com.sabrullasDevLabs.demoCaching.controller;

import com.sabrullasDevLabs.demoCaching.model.Book;
import com.sabrullasDevLabs.demoCaching.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBook(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        Book book = bookService.getBookById(id);
        long end = System.currentTimeMillis();
        if (book == null) {
            return ResponseEntity.status(404).body(Map.of(
                    "message", "Book not found",
                    "timeTakenMs", (end - start)
            ));
        }

        return ResponseEntity.ok(Map.of(
                "book", book,
                "timeTakenMs", (end - start)
        ));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.save(book));
    }
}
