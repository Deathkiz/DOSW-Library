package edu.eci.dosw.DOSW_Library.controller;


import edu.eci.dosw.DOSW_Library.controller.dto.BookRequestDTO;
import edu.eci.dosw.DOSW_Library.controller.dto.BookResponseDTO;
import edu.eci.dosw.DOSW_Library.controller.mapper.BookMapper;
import edu.eci.dosw.DOSW_Library.core.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.dosw.DOSW_Library.core.service.BookService;

@RestController
@RequestMapping("/libro")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(@RequestBody BookRequestDTO book) {
        Book response = bookService.createBook(book);
        BookMapper.toD
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
