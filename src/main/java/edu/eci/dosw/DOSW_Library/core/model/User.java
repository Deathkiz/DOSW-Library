package edu.eci.dosw.DOSW_Library.core.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private String name;
    private String id;
    private String username;
    private String password;
    private String role;
    private String email;
    private Membership membership;
    private LocalDate dateLibrary;
}
