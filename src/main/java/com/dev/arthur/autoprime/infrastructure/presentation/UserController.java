package com.dev.arthur.autoprime.infrastructure.presentation;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.useCases.CreateUserCase;
import com.dev.arthur.autoprime.infrastructure.mapper.UserRequestMapper;
import com.dev.arthur.autoprime.infrastructure.mapper.UserResponseMapper;
import com.dev.arthur.autoprime.infrastructure.request.SignupRequest;
import com.dev.arthur.autoprime.infrastructure.response.UserResponse;
import com.dev.arthur.autoprime.infrastructure.security.JwtUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserCase createUserCase;
    private final UserRequestMapper userRequestMapper;
    private final UserResponseMapper userResponseMapper;
    private final JwtUtil jwt;





    @PostMapping("/register")
    public ResponseEntity<UserResponse> newUser(@RequestBody @Valid SignupRequest signupRequest) {
        AppUser appUser = createUserCase.execute(userRequestMapper.requestToDomain(signupRequest));
        jwt.generateToken(appUser);
        UserResponse response = userResponseMapper.domainToResponse(appUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
