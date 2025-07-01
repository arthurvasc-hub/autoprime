package com.dev.arthur.autoprime.infrastructure.presentation;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.useCases.CreateUserCase;
import com.dev.arthur.autoprime.domain.useCases.FindUserCase;
import com.dev.arthur.autoprime.infrastructure.mapper.UserRequestMapper;
import com.dev.arthur.autoprime.infrastructure.mapper.UserResponseMapper;
import com.dev.arthur.autoprime.infrastructure.request.LoginRequest;
import com.dev.arthur.autoprime.infrastructure.request.SignupRequest;
import com.dev.arthur.autoprime.infrastructure.response.UserResponse;
import com.dev.arthur.autoprime.infrastructure.security.JwtUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserCase createUserCase;
    private final FindUserCase findUserCase;
    private final UserRequestMapper userRequestMapper;
    private final UserResponseMapper userResponseMapper;
    private final JwtUtil jwtUtil;


    @PostMapping("/register")
    public ResponseEntity<UserResponse> newUser(@RequestBody @Valid SignupRequest signupRequest) {
        AppUser appUser = createUserCase.execute(userRequestMapper.requestToDomain(signupRequest));
        UserResponse response = userResponseMapper.domainToResponse(appUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/auth/login")
    public ResponseEntity<String> loginUser(@RequestBody @Valid LoginRequest login) {
        AppUser foundUser = findUserCase.execute(login.email());
        if(!Objects.equals(foundUser.email(), login.email()) || !Objects.equals(foundUser.password(), login.password())) {
            jwtUtil.generateToken(foundUser);

        }
    }

}
