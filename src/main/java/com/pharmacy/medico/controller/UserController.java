package com.pharmacy.medico.controller;

import com.pharmacy.medico.payload.request.LoginRequest;
import com.pharmacy.medico.payload.request.SignupRequest;
import com.pharmacy.medico.payload.request.UpdateProfileRequest;
import com.pharmacy.medico.payload.response.LoginResponse;
import com.pharmacy.medico.payload.response.UpdatedProfileResponse;
import com.pharmacy.medico.payload.response.UserDto;
import com.pharmacy.medico.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> registerNewUser(@RequestBody SignupRequest signupRequest) {
        boolean flag = userService.signupUser(signupRequest);
        return flag ? new ResponseEntity<>(HttpStatus.CREATED) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest) {
        return new ResponseEntity<>(userService.loginUser(loginRequest), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<UserDto> getUserFromId(@RequestParam UUID userId) {
        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
    }

    @PutMapping("/update-profile")
    public ResponseEntity<UpdatedProfileResponse> updateUserProfile(@RequestParam UUID userId, @RequestBody UpdateProfileRequest updateProfileRequest) {
        return new ResponseEntity<>(userService.updateUser(userId, updateProfileRequest), HttpStatus.OK);
    }

    @DeleteMapping("/delete-account")
    public HttpStatus deleteUser(@RequestParam String email) {
        userService.deleteUser(email);
        return HttpStatus.NO_CONTENT;
    }
}
