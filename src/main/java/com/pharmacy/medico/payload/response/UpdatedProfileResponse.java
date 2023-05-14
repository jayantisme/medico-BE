package com.pharmacy.medico.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdatedProfileResponse {
    private String firstName;
    private String lastName;
    private String userPhone;
    private String userEmail;
}
