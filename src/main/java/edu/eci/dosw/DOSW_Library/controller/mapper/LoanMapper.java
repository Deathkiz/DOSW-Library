package edu.eci.dosw.DOSW_Library.controller.mapper;

import edu.eci.dosw.DOSW_Library.controller.dto.BookResponseDTO;
import edu.eci.dosw.DOSW_Library.controller.dto.LoanResponseDTO;
import edu.eci.dosw.DOSW_Library.core.model.Book;
import edu.eci.dosw.DOSW_Library.core.model.Loan;

public interface LoanMapper {
    LoanResponseDTO toDto(Loan loan);

    Loan toEntity(LoanResponseDTO dto);

}
