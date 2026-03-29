package edu.eci.dosw.DOSW_Library.controller.mapper;

import edu.eci.dosw.DOSW_Library.controller.dto.BookResponseDTO;
import edu.eci.dosw.DOSW_Library.core.model.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {
    BookResponseDTO toDto(Book book);

    Book toEntity(BookResponseDTO dto);

}
