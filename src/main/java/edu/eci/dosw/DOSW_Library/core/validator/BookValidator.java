package edu.eci.dosw.DOSW_Library.core.validator;

import edu.eci.dosw.DOSW_Library.core.exception.BookNotAvailableException;
import edu.eci.dosw.DOSW_Library.core.model.Book;

public class BookValidator {
    public static void validate(Book book){
        validateAvailable(book.getIsAvailable());

    }


    private static void validateAvailable(boolean isAvailable){
        if(!isAvailable){
            throw new BookNotAvailableException("EL libro no esta disponible");
        }
    }
}
