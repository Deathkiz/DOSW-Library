package edu.eci.dosw.DOSW_Library.controller.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class BookResponseDTO {
    private String id;
    private int totalCopies;
    private int availableCopies;
    private String category;
    private String publicationType;
    private LocalDate releaseDate;
    private String isbn;
    private boolean isAvailable;
    private String title;
    private String author;
}
