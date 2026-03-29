package edu.eci.dosw.DOSW_Library.controller.dto;

import edu.eci.dosw.DOSW_Library.core.model.Book;
import edu.eci.dosw.DOSW_Library.core.model.Status;
import edu.eci.dosw.DOSW_Library.core.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class LoanResponseDTO {
    private Book book;
    private User user;
    private LocalDate loanDate;
    private Status status;
    private LocalDate returnDate;
}
