package edu.eci.dosw.DOSW_Library.controller.mapper;


import edu.eci.dosw.DOSW_Library.controller.dto.BookResponseDTO;
import edu.eci.dosw.DOSW_Library.controller.dto.UserResponseDTO;
import edu.eci.dosw.DOSW_Library.core.model.Book;
import edu.eci.dosw.DOSW_Library.core.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserResponseDTO toDto(User user);

    User toEntity(UserResponseDTO dto);

}
