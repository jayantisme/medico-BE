package com.pharmacy.medico.service.impl;

import com.pharmacy.medico.model.User;
import com.pharmacy.medico.payload.request.LoginRequest;
import com.pharmacy.medico.payload.request.SignupRequest;
import com.pharmacy.medico.payload.request.UpdateProfileRequest;
import com.pharmacy.medico.payload.response.LoginResponse;
import com.pharmacy.medico.payload.response.UpdatedProfileResponse;
import com.pharmacy.medico.payload.response.UserDto;
import com.pharmacy.medico.repository.UserRepository;
import com.pharmacy.medico.service.UserService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public LoginResponse loginUser(LoginRequest loginRequest) {
        User user = userRepository.findByUserEmail(loginRequest.getUserEmail());
        return modelMapper.map(user, LoginResponse.class);
    }

    @Override
    public boolean signupUser(SignupRequest signupRequest) {
        User user = modelMapper.map(signupRequest, User.class);
        userRepository.save(user);
        return true;
    }

    @Override
    public UserDto getUser(UUID userId) {
        Optional<User> user = userRepository.findById(userId);
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public UpdatedProfileResponse updateUser(UUID userId, UpdateProfileRequest updateProfileRequest) {
        User user = modelMapper.map(updateProfileRequest, User.class);
        user.setUserId(userId);
        userRepository.save(user);
        return modelMapper.map(user, UpdatedProfileResponse.class);
    }

    @Override
    public boolean deleteUser(String email) {
        userRepository.delete(userRepository.findByUserEmail(email));
        return true;
    }
}
