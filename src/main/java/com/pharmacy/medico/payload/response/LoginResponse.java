package com.pharmacy.medico.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    UUID userId;
    String firstName;
    String lastName;
//    String userType;
//    boolean userBlocked;
}
