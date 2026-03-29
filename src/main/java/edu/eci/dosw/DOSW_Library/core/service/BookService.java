package edu.eci.dosw.DOSW_Library.core.service;

import edu.eci.dosw.DOSW_Library.controller.dto.BookRequestDTO;
import edu.eci.dosw.DOSW_Library.controller.dto.BookResponseDTO;
import edu.eci.dosw.DOSW_Library.core.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookService {

    public Book createBook(BookRequestDTO book){
        Book result = new Book();
        result.setId("1");
        result.setIsbn(book.getIsbn());
        result.setTitle(book.getTitle());
        result.setAuthor(book.getAuthor());
        result.setCategory(book.getCategory());
        result.setAvailable(book.isAvailable());
        result.setAvailableCopies(book.getAvailableCopies());
        result.setTotalCopies(book.getTotalCopies());
        result.setTotalCopies(book.getTotalCopies());
        return result;
    }






}
