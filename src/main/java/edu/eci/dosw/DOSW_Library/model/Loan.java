package edu.eci.dosw.DOSW_Library.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Loan {
    private Book book;
    private User user;
    private LocalDate loanDate;
    private Status status;
    private LocalDate returnDate;


}
