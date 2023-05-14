package com.pharmacy.medico.service;

import com.pharmacy.medico.model.User;
import com.pharmacy.medico.payload.request.LoginRequest;
import com.pharmacy.medico.payload.request.SignupRequest;
import com.pharmacy.medico.payload.request.UpdateProfileRequest;
import com.pharmacy.medico.payload.response.LoginResponse;
import com.pharmacy.medico.payload.response.UpdatedProfileResponse;
import com.pharmacy.medico.payload.response.UserDto;

import java.util.UUID;

public interface UserService {
    LoginResponse loginUser(LoginRequest loginRequest);

    boolean signupUser(SignupRequest signupRequest);

    UserDto getUser(UUID userId);

    UpdatedProfileResponse updateUser(UUID userId, UpdateProfileRequest updateProfileRequest);

    boolean deleteUser(String email);
}
