package com.pharmacy.medico.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    UUID userId;
    String firstName;
    String lastName;
    String userPhone;
    String userEmail;
    boolean userBlocked;
    Timestamp createdAt;
    Timestamp updatedAt;
}
